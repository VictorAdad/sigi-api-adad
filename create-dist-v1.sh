#!/bin/bash

# SET UP DIST PACKAGE v0.1
# CREATED: 10/05/2017
# 
# Creates a packaged distribution for deployment
# Optionally, uploads it to the designated server
# 
# Options:
# 
# -s <user@server:path>
#   If provided, attempts to scp the created dist to the server passed as argument


# Obtiene el nombre del directorio, debería llamarse igual al dist de la app
DIR_NAME="$(basename $PWD)"
# Directorio donde se envían las distribuciones
DIST_DIR="target/universal/"
# Nombre completo de la distribución
DIST_NAME="$DIR_NAME-1.0.0-SNAPSHOT" 
# Ruta y nombre completo de la distribución creada
DIST_FULLNAME=$DIST_DIR$DIST_NAME

printf "\33[41m Cleaning the project ('activator clean')... \e[0m \n"
sbt clean

printf "\33[41m Compiling the entire project ('activator stage')... \e[0m \n"
sbt stage

printf "\33[41m Creating the dist as a tarball ('activator universal:packageZipTarball')... \e[0m \n"
sbt universal:packageZipTarball

printf "\33[41m Renaming the dist to append current date... \e[0m \n"
mv $DIST_FULLNAME".tgz" $DIST_FULLNAME"-$(date +'%m-%d-%Y').tgz"

printf "\33[41m Moving the dist to the dest directory (/home/evomatik/Downloads/backend)... \e[0m \n"
mv $DIST_FULLNAME"-$(date +'%m-%d-%Y').tgz" /home/evomatik/Downloads/backend

while getopts ":s:" opt; do
  case $opt in
    s)
        printf "\33[41m Attempting to upload dist to $OPTARG \e[0m \n"
        scp $DIST_FULLNAME"-$(date +'%m-%d-%Y').tgz" $OPTARG
        ;;
    \?)
        echo "Invalid option: -$OPTARG" >&2
        exit 1
        ;;
    :)
        echo "Option -$OPTARG requires an argument." >&2
        exit 1
        ;;
  esac
done

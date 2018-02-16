#borrar archivos de errores
f = open('error.txt', 'w')
f.write('')
f.close()

#imprimo y loggeo
def logger(action, respuesta):
    print(action)
    print('Response status code:', respuesta.status_code)
    if respuesta.status_code == 500 :
        print('--------------------------ERROR------------------------------\n')
        print('Response content:', respuesta.content)
        print('--------------------------ERROR------------------------------\n')
        f = open('error.txt', 'a')
        f.write('\n' + action+'\n:' + 'Response status code: \n' + str(respuesta.status_code) + '\n' + 'Response content: \n' + str(respuesta.content))
        f.close()
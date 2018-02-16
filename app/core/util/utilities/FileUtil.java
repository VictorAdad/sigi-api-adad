package core.util.utilities;

import java.util.UUID;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import org.apache.commons.codec.binary.Base64;

public final class FileUtil{

    public static String getDocumentBase64(byte[] bytesContent){
        byte[] base64=null;
        String base64Str = "";
        try {
            base64 = Base64.encodeBase64(bytesContent);
            base64Str = new String(base64, "UTF-8");
        } catch (Throwable e) {
            e.printStackTrace();
            return "";
        }
        return base64Str;
    }

    public static File getFileFromBase64(String base64, String extension){
        try {
            byte[] decoded = Base64.decodeBase64(base64);
            File file = File.createTempFile("temp_"+UUID.randomUUID().toString(), extension); 
            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file));
            writer.write(decoded);
        writer.flush();
            writer.close();
            return file;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
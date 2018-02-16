package core.util.pdf;

import java.io.IOException;
import java.io.File;
import java.util.Map;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.lang.StringBuffer;
import javax.inject.Inject;
import play.Configuration;
import play.Logger;

// More info on this library: http://www.nixo-soft.de/tutorials/jlr/JLRTutorial.html
import de.nixosoft.jlr.*;

public class Pdf{

    @Inject
    private Configuration configuration;
    private String template;
    private String fileName;
    private File workingDir;
    private File tempDir;

    public Pdf(Configuration configuration)
    {
        this.configuration = configuration;
        this.template      = template;
        this.fileName      = fileName;
        this.workingDir    = new File(this.configuration.getString("Evomatik.pathApp") + "reports");
        this.tempDir       = new File(this.workingDir.getAbsolutePath() + File.separator + "temp");
        Logger.debug("=> NEW PDF ");
        Logger.debug("=> template: "+this.template);
        Logger.debug("=> fileName: "+this.fileName);
        Logger.debug("=> workingDir: "+this.workingDir);
        Logger.debug("=> tempDir: "+this.tempDir);
    }

    public byte[] generate(Map<String, String> settings, Map<String, Object> data){
        // Obtener el archivo plantilla de latex donde se reemplazarán los valores obtenidos en las consultas

        // if (!this.tempDir.isDirectory())
        //     this.tempDir.mkdir();
        Logger.debug("=> Settings "+settings);
        JLRConverter converter  = new JLRConverter(this.workingDir);
        JLRGenerator pdfGen     = new JLRGenerator();
        String currentTex       = this.workingDir.getAbsolutePath() + File.separator + settings.get("template")+ ".tex";
        String currentReport    = this.tempDir.getAbsolutePath() + File.separator + settings.get("fileName") + ".tex";
        File templateFile       = new File(currentTex);
        File reportFile         = new File(currentReport);

        Logger.debug("=> file template: "+templateFile);
        Logger.debug("=> file report: "+reportFile);

        for (Map.Entry<String, Object> entry : data.entrySet())
        {
            converter.replace(entry.getKey(), entry.getValue());
        }

        try {
            if (!converter.parse(templateFile, reportFile))
                Logger.error("Parsing Error!: " + converter.getErrorMessage());

            if (!pdfGen.generate(reportFile, this.tempDir, workingDir))
                Logger.error("Generating Error: " + pdfGen.getErrorMessage());

            Logger.debug("PDF: " + pdfGen.getPDF());
        }catch (IOException ex) {
            Logger.error("IOException: " + ex.getMessage());
        }
        File log = new File(this.tempDir.getAbsolutePath() + File.separator + settings.get("fileName") + ".log");
        File aux = new File(this.tempDir.getAbsolutePath() + File.separator + settings.get("fileName") + ".aux");

        byte[] contenido = getBytesFile(pdfGen.getPDF());
        pdfGen.getPDF().delete();
        log.delete();
        aux.delete();
        reportFile.delete();

        return contenido;
    }

    public byte[] getBytesFile(File file)
    {
        byte[] bFile = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream=null;
     
            try {
              //convert file into array of bytes
              fileInputStream = new FileInputStream(file);
              fileInputStream.read(bFile);
              fileInputStream.close();

            }catch(Exception e){
              e.printStackTrace();
            }
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
          
        return bFile;
      }
}

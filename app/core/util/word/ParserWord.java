package core.util.word;

import play.Logger;
import java.util.HashMap;
import java.util.List;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;


public class ParserWord {

    //lee documento de word docx y reemplaza parametros
    public static byte[] parsingDocument(InputStream archivo,HashMap<String, Object> mapeoValores) throws Exception{
        
        XWPFDocument doc = new XWPFDocument(  archivo );
        for (XWPFParagraph p : doc.getParagraphs()) {
            List<XWPFRun> runs = p.getRuns();
            if (runs != null) {
                for (XWPFRun r : runs) {
                    reemplazarValores(r,mapeoValores);
                }
            }
        }

        for (XWPFTable tbl : doc.getTables()) {
            for (XWPFTableRow row : tbl.getRows()) {
                for (XWPFTableCell cell : row.getTableCells()) {
                    for (XWPFParagraph p : cell.getParagraphs()) {
                        for (XWPFRun r : p.getRuns()) {
                            reemplazarValores(r,mapeoValores);
                        }
                    }
                }
            }
        }
        
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        doc.write(baos);        
        byte[] newWord = baos.toByteArray();
        baos.close();
        doc.close();
        return newWord;  
          
    }


    public static void reemplazarValores(XWPFRun r,HashMap<String,Object>atributos) throws Exception {
        String text = r.getText(0);
        for(String parametro: atributos.keySet() ){
            if (text != null && text.contentEquals(parametro)) {
                if(atributos.get(parametro)!=null){
                    String value = (String) atributos.get(parametro);
                    value = value.replace("<","");
                    value = value.replace(">","");
                    value = value.replace("&","");
                    text = text.replace(parametro, value);
                } else {
                    text = text.replace(parametro, " ");
                }
                r.setText(text, 0);
            }    
        }
        
    }

}

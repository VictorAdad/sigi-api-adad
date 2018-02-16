package core.util.utilities;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Locale;

public final class DateUtil{

    public static String parseDateString(Date date)
    {
        String dateString = "";
        if(date != null)
        {
          DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
          dateString = df.format(date);
        }
        return dateString;
    } 
    
    public static Date parseString( String dateInString, String stringFormat)
    {
       SimpleDateFormat formatter = new SimpleDateFormat(stringFormat);
       Date date = null;
       try {

           date = formatter.parse(dateInString);

       } catch (Exception e) {
           //e.printStackTrace();
       }
       return date;
    }
    public static Date parseString( String dateInString, String stringFormat, Locale locale)
    {
       SimpleDateFormat formatter = new SimpleDateFormat(stringFormat,locale);
       Date date = null;
       try {

           date = formatter.parse(dateInString);

       } catch (Exception e) {
           //e.printStackTrace();
       }
       return date;
    }
    public static Date parseString(String dateString){
        Date date = null;
        date = parseString(dateString, "dd-MMM-yy",Locale.ENGLISH);
        if (date!=null)
            return date;
        date = parseString(dateString, "dd-MMM-yyyy",Locale.ENGLISH);
        if (date!=null)
            return date;
        date = parseString(dateString, "dd/MMM/yy",Locale.ENGLISH);
        if (date!=null)
            return date;
        date = parseString(dateString, "dd/MMM/yyyy",Locale.ENGLISH);
        if (date!=null)
            return date;
        Locale l = new Locale("es","MX","MX");
        date = parseString(dateString, "dd-MMM-yy",l);
        if (date!=null)
            return date;
        date = parseString(dateString, "dd-MMM-yyyy",l);
        if (date!=null)
            return date;
        date = parseString(dateString, "dd/MMM/yy",l);
        if (date!=null)
            return date;
        date = parseString(dateString, "dd/MMM/yyyy",l);
        if (date!=null)
            return date;
        return null;
    }

    public static Calendar getLastDayMonth(int mes, int anio)
    {
      Calendar calendar = Calendar.getInstance();
        switch(mes){
              case 0:  // Enero
              case 2:  // Marzo
              case 4:  // Mayo
              case 6:  // Julio
              case 7:  // Agosto
              case 9:  // Octubre
              case 11: // Diciembre
              calendar.set(anio,mes,31);
              break;
              case 3:  // Abril
              case 5:  // Junio
              case 8:  // Septiembre
              case 10: // Noviembre
              calendar.set(anio,mes,30);
              break;
              case 1:  // Febrero
                  if(((anio%100 == 0) && (anio%400 == 0)) || ((anio%100 != 0) && (anio%  4 == 0))){
                     calendar.set(anio,mes,29);
                  }
                  else{
                    calendar.set(anio,mes,28);
                  }
              break;
        }
        return calendar;
    }

    public static String format(Date date, String format)
    {
        DateFormat formatter = new SimpleDateFormat(format);
        String string = "";
        try{
            string = formatter.format(date);
        }catch(Exception e){
            e.printStackTrace();
        }
        return string;
    }

}
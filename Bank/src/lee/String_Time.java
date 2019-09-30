package lee;



import java.text.SimpleDateFormat;
import java.util.Date;

public class String_Time {
    private static Date d;
    private static SimpleDateFormat date =  new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat time = new SimpleDateFormat("kk:mm:ss");


    public static String Date(){
        d = new Date();
        final String currentDate = date.format(d);
        return currentDate;
    }

    public static String Time(){
        d = new Date();
        final String currentTime = time.format(d);
        return currentTime;
    }
}

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try {
            for (int i = 0; i < 10000; i++) {
                Thread.sleep(2);
            }
        } catch (Exception e){}


        long end = System.currentTimeMillis();

        //System.out.print("Time: " + (end - start));

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();

        String day = dateFormat.format(date);

        System.out.print(day);
    }
}

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("hh:mm a dd/MM/YYYY");
        Date date = new Date();

        System.out.println(format.format(date));
    }
}

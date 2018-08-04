import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintTime {
    public static void main(String[] args) {
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_TIME;
//        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(LocalDateTime.now()));
    }
}

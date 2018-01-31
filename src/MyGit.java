import java.text.SimpleDateFormat;
import java.util.Date;

public class MyGit {
    public static void myGit() {
        Date date = new Date();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMMM d, yyyy");
        System.out.println("Date: " + dateFormatter.format(date));
        System.out.println("dankel");
        System.out.println("I love Cloud Computing");
    }

    public static void main(String[] args) {
        myGit();
    }
}

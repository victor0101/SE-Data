import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class Main {

    public static String nextdate(String date, int n) {
        LocalDate parsedDate = LocalDate.parse(date);
        LocalDate addedDate = parsedDate.plusDays(n);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return addedDate.format(formatter);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("int to increment");
        int n = reader.nextInt();
        System.out.println(nextdate("1990-02-03", n));

    }
}



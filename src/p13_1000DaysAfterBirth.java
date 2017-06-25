import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p13_1000DaysAfterBirth {

    public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate yourBirthday = LocalDate.parse(input.nextLine(), formatter);
            yourBirthday = yourBirthday.plusDays(1000);
            System.out.println(yourBirthday.format(formatter));

    }
}                                                       

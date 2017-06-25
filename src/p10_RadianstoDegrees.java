import java.util.Scanner;

public class p10_RadianstoDegrees {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double radians = Double.parseDouble(input.nextLine());
        double degrees = radians*180/Math.PI;
        System.out.println(Math.round(degrees));

    }
}

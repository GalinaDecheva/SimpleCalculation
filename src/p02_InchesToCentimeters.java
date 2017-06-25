import java.util.Scanner;
public class p02_InchesToCentimeters {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter inches = ");
        double inches = Double.parseDouble(input.nextLine());
        double centimeters = inches * 2.54;
        System.out.println("centimeters = " + centimeters );
    }
}
//3. От инчове към сантиметри
//Да се напише програма, която чете от конзолата число (не непременно цяло) и преобразува числото от
//инчове в сантиметри. За целта умножава инчовете по 2.54 (защото 1 инч = 2.54 сантиметра).
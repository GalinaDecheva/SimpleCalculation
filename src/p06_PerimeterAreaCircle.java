import java.util.Scanner;

public class p06_PerimeterAreaCircle {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
        double r = Double.parseDouble(input.nextLine());
        double area = Math.PI*r*r;
        double perimeter = 2*Math.PI*r;
        System.out.printf("Area = %f \n",area);
        System.out.printf("Perimeter = %f",perimeter);
    }
}

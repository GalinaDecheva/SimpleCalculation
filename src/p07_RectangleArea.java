import java.util.Scanner;
import java.lang.Math;

public class p07_RectangleArea {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        double x1 = Double.parseDouble(input.nextLine());
        double y1 = Double.parseDouble(input.nextLine());
        double x2 = Double.parseDouble(input.nextLine());
        double y2 = Double.parseDouble(input.nextLine());
        double width = Math.abs(x2-x1);
        double height = Math.abs(y2-y1);
        double area = width*height;
        double perimeter = 2*(width+height);
        System.out.println(area);
        System.out.println(perimeter);

    }
}

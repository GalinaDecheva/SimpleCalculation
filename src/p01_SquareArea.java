import java.util.Scanner;
public class p01_SquareArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a= ");
        int a = Integer.parseInt(input.nextLine());
        int area = a * a;
        System.out.println( "Square = " + area);
    }
}

//2. Пресмятане на лице на квадрат
//Първата задача от тази тема е следната: да се напише конзолна програма, която въвежда цяло число a и
//пресмята лицето на квадрат със страна a.
import java.util.Scanner;

public class p14_LearningRoom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double h = Double.parseDouble(input.nextLine());
        double w = Double.parseDouble(input.nextLine());
        int hToCm = (int)(h * 100);
        int wToCm = (int)(w * 100);
        int row = hToCm / 120;
        int coridor = 100;
        int wWithoutcoridor = wToCm - coridor;
        int tableOnRow = wWithoutcoridor / 70;
        int numberPlace = (row *tableOnRow) - 3;

        System.out.println(numberPlace);


    }
}

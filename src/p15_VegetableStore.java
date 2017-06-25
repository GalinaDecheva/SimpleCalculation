import java.util.Scanner;

public class p15_VegetableStore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double priceVegetable = Double.parseDouble(input.nextLine());
        double priceFruit = Double.parseDouble(input.nextLine());
        int kgVegetable = Integer.parseInt(input.nextLine());
        int kgFruit = Integer.parseInt(input.nextLine());
        double totalVegetable = priceVegetable * kgVegetable;
        double totalFruit = priceFruit * kgFruit;
        double total = totalVegetable + totalFruit;
        Double bgnToEuro = total / 1.94;
        System.out.printf("%f", bgnToEuro);
    }
}

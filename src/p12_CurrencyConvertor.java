import java.util.Scanner;

public class p12_CurrencyConvertor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount = Double.parseDouble(input.nextLine());
        String enterCurrency = input.nextLine();
        String exitCurrency = input.nextLine();


        double inputFX = getFX(enterCurrency);
        double outputFX = getFX(exitCurrency);
        double totalFX = inputFX/outputFX;
        double totalFXPrint = totalFX*amount;
        System.out.printf("%.2f %s",totalFXPrint,exitCurrency );

    }

    public static double getFX(String currency){
        switch(currency){
            case "BGN":return 1.0;
            case "USD":return 1.79549;
            case "EUR": return 1.95583;
            case "GBP": return 2.53405;
            default: return 1.0;
        }
    }
}



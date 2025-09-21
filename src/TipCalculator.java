import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        double bill = scanner.nextDouble();
        double tipPercentage;
        System.out.println("Enter tip percentage:");
        tipPercentage=scanner.nextDouble();
        double tipAmount= bill * tipPercentage/ 100;
        double total = bill + tipAmount;
        System.out.println("Tip Amount: " + tipAmount);
        System.out.println("Total Amount (Bill + Tip):" + total);
        scanner.close();
    }
}
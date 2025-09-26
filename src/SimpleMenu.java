import java.util.Scanner;
public class SimpleMenu{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your Bank Account!");
        System.out.println("1. View Balance");
        System.out.println("2. Deposite");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("Enter your Choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Viewing Balance..");
                break;
            case 2:
            System.out.println("Proceeding to deposite");
            break;
            case 3:
            System.out.println("Initiating Withdrawl");
            break;
            case 4:
            System.out.println("Exiting. Thank you!");
            break;
            default:
            System.out.println("Invalid choice. Please try again");
                break;
        }
        scanner.close();
    }
}
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        // Prices for products
        double price1 = 2.98;
        double price2 = 4.50;
        double price3 = 9.98;
        double price4 = 4.49;
        double price5 = 6.87;

        Scanner input = new Scanner(System.in);
        int productNumber;
        int quantitySold;
        double totalValue = 0;

        // Sentinel-controlled loop
        do {
            System.out.print("Enter product number (1-5 or 0 to stop): ");
            productNumber = input.nextInt();

            if (productNumber == 0) {
                break; // Exit the loop if the user enters 0
            }

            System.out.print("Enter quantity sold: ");
            quantitySold = input.nextInt();

            switch (productNumber) {
                case 1:
                    totalValue += price1 * quantitySold;
                    break;
                case 2:
                    totalValue += price2 * quantitySold;
                    break;
                case 3:
                    totalValue += price3 * quantitySold;
                    break;
                case 4:
                    totalValue += price4 * quantitySold;
                    break;
                case 5:
                    totalValue += price5 * quantitySold;
                    break;
                default:
                    System.out.println("Invalid product number. Please enter a number between 1 and 5.");
            }
        } while (productNumber != 0);

        System.out.printf("Total retail value of all products sold is: $%.2f%n", totalValue);
    }
}
import java.util.Scanner;

public class CreditEvaluator {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Create a new scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of customers
        System.out.print("Enter number of customers: ");
        // Read the user's input and store it in a variable
        int numberOfCustomers = scanner.nextInt();

        // Loop through each customer
        for (int i = 1; i <= numberOfCustomers; i++) {
            // Display the current customer number
            System.out.println("Customer " + i);

            // Prompt the user to enter the credit limit for the customer
            System.out.print("Enter credit limit: ");
            // Read the user's input and store it in a variable
            double creditLimit = scanner.nextDouble();

            // Prompt the user to enter the price of the item
            System.out.print("Enter item price: ");
            // Read the user's input and store it in a variable
            double itemPrice = scanner.nextDouble();

            // Prompt the user to enter the quantity of the item
            System.out.print("Enter item quantity: ");
            // Read the user's input and store it in a variable
            int itemQuantity = scanner.nextInt();

            // Calculate the total value of the purchase by multiplying the item price by the item quantity
            double totalValue = itemPrice * itemQuantity;

            // If the total value exceeds the credit limit, ask the user to enter a new quantity or cancel the transaction
            while (totalValue > creditLimit) {
                System.out.println("Sorry you cannot purchase goods of such value on credit.");
                System.out.println("Please enter the quantity of the item or enter '0' to cancel the transaction: ");

                // Read the user's input for a new quantity or to cancel the transaction
                int newQuantity = scanner.nextInt();

                // If the user enters 0, break out of the loop and move on to the next customer
                if (newQuantity == 0) {
                    break;
                }

                // Calculate the new total value based on the new quantity
                totalValue = itemPrice * newQuantity;
                itemQuantity = newQuantity;
            }

            // If the total value is within the credit limit, display a thank you message and the total value of the purchase
            if (totalValue <= creditLimit) {
                System.out.println("Thank you for purchasing from us.");
                System.out.println("Total value of purchase: " + totalValue);
            }
        }

        // Close the scanner object
        scanner.close();
    }
}
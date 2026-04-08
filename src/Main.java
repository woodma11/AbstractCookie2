import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Cookie Menu ---");
            System.out.println("1. Chocolate Chip");
            System.out.println("2. Sugar");
            System.out.println("3. Oatmeal Raisin");
            System.out.println("4. Exit");

            System.out.print("Choose a cookie by choice number: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                running = false;
                System.out.println("You've exited successfully, Goodbye!");
                break;
            }

            Cookie cookie = SweetTreatFactory.createSweetTreat(choice);

            if (cookie != null) {
                cookie.displayRecipe();
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
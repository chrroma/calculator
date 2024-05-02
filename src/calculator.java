import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculator");

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("numA: ");
                int numA = scanner.nextInt();
                System.out.print("numB: ");
                int numB = scanner.nextInt();
                int sum = numA + numB;
                System.out.println("the sum is: " + sum);
            }
            if (choice == 2) {
                System.out.print("numA: ");
                int numA = scanner.nextInt();
                System.out.print("numB: ");
                int numB = scanner.nextInt();
                int difference = numA - numB;
                System.out.println("the difference is: " + difference);
            }
            if (choice == 3) {
                System.out.print("numA: ");
                int numA = scanner.nextInt();
                System.out.print("numB: ");
                int numB = scanner.nextInt();
                int product = numA*numB;
                System.out.println("the product is: " + product);
            }
            if (choice == 4) {
                System.out.print("numA: ");
                int numA = scanner.nextInt();
                System.out.print("numB: ");
                int numB = scanner.nextInt();
                int quotient = numA / numB;
                System.out.println("the quotient is: " + quotient);
            }
            if (choice == 5) {
                System.out.println("bye bye");
                break;
            }
        }
    }
}
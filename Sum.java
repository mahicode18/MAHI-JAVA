import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));

        if (b != 0) {
            System.out.println("Quotient = " + (a / b));
        } else {
            System.out.println("Quotient: Cannot divide by zero");
        }

        sc.close();
    }
}

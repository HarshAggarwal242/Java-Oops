import java.util.*;

public class quadraticSolve{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        int a = scanner.nextInt();

        System.out.print("Enter coefficient b: ");
        int b = scanner.nextInt();

        System.out.print("Enter coefficient c: ");
        int c = scanner.nextInt();

        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be zero)");
        } else {
            // Calculate the discriminant
            int discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                // Two real and distinct roots
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two real and distinct solutions:");
                System.out.println("x1 = " + root1);
                System.out.println("x2 = " + root2);
            } else if (discriminant == 0) {
                // One real root
                double root = -b / (2 * a);
                System.out.println("One real solution:");
                System.out.println("x = " + root);
            } else {
                // No real roots
                System.out.println("No real solutions. Discriminant is negative.");
            }
        }
    }
}

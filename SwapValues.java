import java.util.*;

public class SwapValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first positive integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second positive integer (b): ");
        int b = scanner.nextInt();

        System.out.println("\nSwapping using a third variable");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);

        
    }
}

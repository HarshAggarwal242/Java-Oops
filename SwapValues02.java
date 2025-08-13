import java.util.Scanner;

public class SwapValues02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first positive integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second positive integer (b): ");
        int b = scanner.nextInt();


        // 2. Swapping without using a third variable
        System.out.println("\nSwapping without using a third variable");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
}
}

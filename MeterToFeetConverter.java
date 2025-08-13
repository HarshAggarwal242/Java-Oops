import java.util.*;

public class MeterToFeetConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in meters: ");
        double meters = scanner.nextDouble();

        double feet = meters * 3.28084;

        System.out.printf("%.2f meters is equal to %.2f feet.\n", meters, feet);

    }
}

import java.util.*;

public class threeIntegers{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer (a): ");
        int a = scanner.nextInt();

        System.out.println("Enter second integer (b): ");
        int b = scanner.nextInt();

        System.out.println("Enter third integer (b): ");
        int c = scanner.nextInt();

        if(a!=b && b!=c && c!=a){
            if(a<b && b<c){
                System.out.println("Strictly Increasing");
            }
            else if(a>b && b>c){
                System.out.println("Strictly Decreasing");

            }
            else if(a<b && b>c){
                System.out.println("Middle number is largest");

            }
            else{
                System.out.println("No specific pattern found");

            }
        }
        
    }
}
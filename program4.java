import java.util.*;

public class program4 {
    public static void main(String[] args) {
        
        System.out.println("Welcome\n");
        System.out.println("Enter 1 for addition\n");
        System.out.println("Enter 2 for subtraction\n");
        System.out.println("Enter 3 for multiplication\n");
        System.out.println("Enter 4 for division\n");
        
        Scanner sc=new Scanner(System.in);
        int ch = sc.nextInt();
        
        switch(ch){

        case 1:
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition of two numbers is\t" + (a+b));
        
        case 2:
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Addition of two numbers is\t" + (c-d));

        case 3:
        int e = sc.nextInt();
        int f = sc.nextInt();
        System.out.println("Addition of two numbers is\t" + (e*f));

        case 4:
        int g = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Addition of two numbers is\t" + (g/h));

        default:
        System.out.println("Invalid choice\n");
        }
        
    }
}
public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 5;  
        int b = 3;    

        int andResult = a & b;  
        System.out.println("Bitwise AND of " + a + " & " + b + " = " + andResult);

        int leftShift = a << 2; 
        System.out.println(a + " << 2 = " + leftShift);

        int rightShift = a >> 2; 
        System.out.println(a + " >> 2 = " + rightShift);
    }
}

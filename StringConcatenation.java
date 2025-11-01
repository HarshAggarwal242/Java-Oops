import java.io.*;
class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2; // Using + operator
        String s4 = s1.concat(" " + s2); // Using concat() method
        System.out.println(s3); // Hello World
    }
}

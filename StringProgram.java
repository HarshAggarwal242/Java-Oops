import java.io.*;
class StringProgram {
    public static void main(String[] args) {
    
        // Creating string from byte array
        byte[] byteArray = { 104, 97, 114, 115, 104 ,32, 104,97,114,115,104,64,103,109,97,105,108,46,99,111,109};
        String str3 = new String(byteArray);
        System.out.println("String from byte array: " + str3);
    }
}

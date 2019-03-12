package ex2;

import java.util.Scanner;

public class Main {

    // He realizado una extraccion de clase separando los metodosde encrypt, cipher, convertToString y convertASCII
    // ya que son los metodos que se necesitan para poder realizar una enciptacion debido a que necesitamos convertir el texto en ascii
    // y luego en string paramas adelante realizar la encriptacion y desencriptacion.

    public static void main(String[] args) {
        //Step 1: read the users text
        System.out.println("Please, insert the message in order to encrypt:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        //Step 2: convert the given input into a char array and convert it its extended ASCII equivalent
        char[] ch = input.toCharArray();
        int[] ascii = Encrypt.converterASCII(ch);

        //Step 3: add +1 to the ASCII equivalence in order to "encode"
        //
        Encrypt.cipher(ascii);

        //Step 4: convert the ASCII codes into chars again and rebuild the string
        String output = Encrypt.convertToString(ch, ascii);

        //Step 5: send the result to the output
        System.out.println("Your encrypted message:");
        System.out.println(output);

        //Step 6: decrypt in order to check if it works
        String reverse = Encrypt.decrypt(ch, ascii);

        //Step 7: send the result to the output
        System.out.println("Your decrypted message:");        
        System.out.println(reverse);
    }

}

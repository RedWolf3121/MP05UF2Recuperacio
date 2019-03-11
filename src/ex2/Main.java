package ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Step 1: read the users text
        System.out.println("Please, insert the message in order to encrypt:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        //Step 2: convert the given input into a char array and convert it its extended ASCII equivalent
        char[] ch = input.toCharArray();
        int[] ascii = converterASCII(ch);

        //Step 3: add +1 to the ASCII equivalence in order to "encode"
        Encrypt.cipher(ascii);

        //Step 4: convert the ASCII codes into chars again and rebuild the string
        String output = convertToString(ch, ascii);

        //Step 5: send the result to the output
        System.out.println("Your encrypted message:");
        System.out.println(output);

        //Step 6: decrypt in order to check if it works
        String reverse = Encrypt.decrypt(ch, ascii);

        //Step 7: send the result to the output
        System.out.println("Your decrypted message:");        
        System.out.println(reverse);
    }

    private static String convertToString(char[] ch, int[] ascii) {
        for (int i = 0; i < ascii.length; i++)
            ch[i] = (char) ascii[i];

        return new String(ch);
    }

    private static int[] converterASCII(char[] ch) {
        int[] ascii = new int[ch.length];
        for(int i = 0; i < ch.length; i++)
            ascii[i] = (int)ch[i];
        return ascii;
    }
}

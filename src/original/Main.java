package original;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Step 1: read the users text
        System.out.println("Please, insert the message in order to encrypt:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        //Step 2: convert the given input into a char array and convert it its extended ASCII equivalent
        char[] ch = input.toCharArray();
        int[] ascii = new int[ch.length];
        for(int i = 0; i < ch.length; i++)
            ascii[i] = (int)ch[i];

        //Step 3: add +1 to the ASCII equivalence in order to "encode"
        for(int i = 0; i < ascii.length; i++)
            ascii[i] += 1;

        //Step 4: convert the ASCII codes into chars again and rebuild the string
        for(int i = 0; i < ascii.length; i++)
            ch[i] = (char)ascii[i];

        //Step 5: send the result to the output
        System.out.println("Your encrypted message:");
        String output = new String(ch);
        System.out.println(output);

        //Step 6: decrypt in order to check if it works
        for(int i = 0; i < ch.length; i++)
            ascii[i] = (int)ch[i];

        for(int i = 0; i < ascii.length; i++)
            ascii[i] -= 1;

        for(int i = 0; i < ascii.length; i++)
            ch[i] = (char)ascii[i];

        System.out.println("Your decrypted message:");
        String reverse = new String(ch);
        System.out.println(reverse);
    }
}

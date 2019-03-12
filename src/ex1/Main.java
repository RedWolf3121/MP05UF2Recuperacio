package ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Step 1: read the users text
        System.out.println("Please, insert the message in order to encrypt:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        //Step 2: convert the given input into a char array and convert it its extended ASCII equivalent
        // He realizado una extraccion del metodo dejando el char porque incluyendolo realiza una extraccionde metodo objeto.
        // De esta forma se puede crear el metodo sin problemas.
        char[] ch = input.toCharArray();
        int[] ascii = converterASCII(ch);

        //Step 3: add +1 to the ASCII equivalence in order to "encode"
        // En elsiguiente paso he separado el codigo que lo que realiza es añadir el siguiente caracter de la letra escrita
        // metiendolo en un metodo y pasando el codigo ascii como parametro.
        cipher(ascii);

        //Step 4: convert the ASCII codes into chars again and rebuild the string
        // En elsiguiente paso he separado el codigo metiendolo en un metodo llamado convertToString ya que lo que hace es convertir en string el codigo ascii.
        // Despues he pasado como parametros el caracter y el codigo ascii guardandoloen un string output.
        String output = convertToString(ch, ascii);

        //Step 5: send the result to the output
        System.out.println("Your encrypted message:");
        System.out.println(output);

        //Step 6: decrypt in order to check if it works
        //He extrido el codigo metiendolo en un metodo llamado decrypt pasando el caracter y el codigo ascci,
        // el codigo se encarga de desencriptar elcodigo el texto realizando la encriptacion a la inversa.
        String reverse = decrypt(ch, ascii);

        //Step 7: send the result to the output
        System.out.println("Your decrypted message:");        
        System.out.println(reverse);
    }

    private static String decrypt(char[] ch, int[] ascii) {
        for(int i = 0; i < ch.length; i++)
            ascii[i] = (int)ch[i];

        for(int i = 0; i < ascii.length; i++)
            ascii[i] -= 1;

        for(int i = 0; i < ascii.length; i++)
            ch[i] = (char)ascii[i];

        return new String(ch);
    }

    private static String convertToString(char[] ch, int[] ascii) {
        for (int i = 0; i < ascii.length; i++)
            ch[i] = (char) ascii[i];

        return new String(ch);
    }

    private static void cipher(int[] ascii) {
        for(int i = 0; i < ascii.length; i++)
            ascii[i] += 1;
    }

    private static int[] converterASCII(char[] ch) {
        int[] ascii = new int[ch.length];
        for(int i = 0; i < ch.length; i++)
            ascii[i] = (int)ch[i];
        return ascii;
    }
}

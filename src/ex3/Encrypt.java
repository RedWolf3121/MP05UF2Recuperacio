package ex3;

public class Encrypt {
    static String decrypt(int[] ascii) {
        //solucionado problema para que el tamaño del array sea el mismo que el del ascii si no daria problemas cuando fuesen de diferente tamaño.
        char[] ch = new char[ascii.length];
        //  eliminado el primer for porque eliminaba el valor de ascii y devolvia siemprre -1.
        for (int i = 0; i < ascii.length; i++)
            ascii[i] -= 1;

        for (int i = 0; i < ascii.length; i++)
            ch[i] = (char) ascii[i];

        return new String(ch);
    }

    static String convertToString( int[] ascii) {
        //solucionado problema para que el tamaño del array sea el mismo que el del ascii si no daria problemas cuando fuesen de diferente tamaño.
        char[] ch = new char[ascii.length];
        for (int i = 0; i < ascii.length; i++)
            ch[i] = (char) ascii[i];

        return new String(ch);
    }

    static void cipher(int[] ascii) {
        for (int i = 0; i < ascii.length; i++)
            ascii[i] += 1;
    }

    static int[] converterASCII(char[] ch) {
        int[] ascii = new int[ch.length];
        for (int i = 0; i < ch.length; i++)
            ascii[i] = (int) ch[i];
        return ascii;
    }
}
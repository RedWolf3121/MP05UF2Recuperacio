package ex2;

public class Encrypt {
    static String decrypt(char[] ch, int[] ascii) {
        for (int i = 0; i < ch.length; i++)
            ascii[i] = (int) ch[i];

        for (int i = 0; i < ascii.length; i++)
            ascii[i] -= 1;

        for (int i = 0; i < ascii.length; i++)
            ch[i] = (char) ascii[i];

        return new String(ch);
    }

    static void cipher(int[] ascii) {
        for (int i = 0; i < ascii.length; i++)
            ascii[i] += 1;
    }
}
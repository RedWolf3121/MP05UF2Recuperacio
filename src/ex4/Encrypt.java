package ex4;

public class Encrypt {

    /***
     * El siguiente metodo se encarga de desencriptat el texto en ASCII para acabar retornando un sting con el texto que se intodujo al principio.
     * @param ch es el array de caracteres donde se almacena cada letra del texto.
     * @param ascii es un array de enteros donde se guarda el codigo ascii del texto.
     * @return devuelve un string con el array de caracteres que contiene el texto desencriptado.
     */
    static String decrypt(char[] ch, int[] ascii) {
        for (int i = 0; i < ch.length; i++)
            ascii[i] = (int) ch[i];

        for (int i = 0; i < ascii.length; i++)
            ascii[i] -= 1;

        for (int i = 0; i < ascii.length; i++)
            ch[i] = (char) ascii[i];

        return new String(ch);
    }

    /***
     * Este metodo se encarga de pasar el texto encriptado en ascci para poder mostrarlo por pantalla.
     * @param ch es el array de caracteres donde se almacena cada letra del texto.
     * @param ascii es un array de enteros donde se guarda el codigo ascii del texto.
     * @return retorna un string con el array de caracteres que contiene el texto encriptado.
     */
    static String convertToString(char[] ch, int[] ascii) {
        for (int i = 0; i < ascii.length; i++)
            ch[i] = (char) ascii[i];

        return new String(ch);
    }

    /***
     * Estemetodo realiza el cifrado del texto en ascii añadiendo el caracter que esta en la siguiente posicion de la tabla ascii.
     * @param ascii contiene el texto escrito en codigo ascii.
     */
    static void cipher(int[] ascii) {
        for (int i = 0; i < ascii.length; i++)
            ascii[i] += 1;
    }

    /***
     * El siguiente metodo se encarga de convertir el texto escrito en codigo ascii.
     * @param ch es el array con los caracteres deltexto escrito.
     * @return retorna un array de enteros con el codigo ascii del texto transformado.
     */
    static int[] converterASCII(char[] ch) {
        int[] ascii = new int[ch.length];
        for (int i = 0; i < ch.length; i++)
            ascii[i] = (int) ch[i];
        return ascii;
    }
}
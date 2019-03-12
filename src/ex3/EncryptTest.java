package ex3;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {

    @org.junit.jupiter.api.Test
    void decrypt() {
        Encrypt encrypt = new Encrypt();

    }

    @org.junit.jupiter.api.Test
    void convertToString() {


        Encrypt encrypt = new Encrypt();
        int[] ascii1 = {122};
        int[] ascii2 = {43,122};
        int[] ascii3 = {43,122,41};
        String s1 = encrypt.convertToString(ascii1);
        String s2 = encrypt.convertToString(ascii2);
        String s3 = encrypt.convertToString(ascii3);

        Assertions.assertEquals("z" ,s1);
        Assertions.assertEquals("+z" ,s2);
        Assertions.assertEquals("+z)" ,s3);
    }

    @org.junit.jupiter.api.Test
    void cipher() {
        int[] p1 = {1};
        Encrypt encrypt = new Encrypt();
        Encrypt.cipher(p1);
        Assertions.assertEquals(p1,"2");

    }

    @org.junit.jupiter.api.Test
    void converterASCII() {
        char[] c1 = {'a'};
        char[] c2 = {'a','z'};
        char[] c3 = {'a','e','*'};
        Encrypt encrypt = new Encrypt();
        int[] ascii1 = encrypt.converterASCII(c1);
        int[] ascii2 = encrypt.converterASCII(c2);
        int[] ascii3 = encrypt.converterASCII(c3);
        Assertions.assertEquals(97 ,ascii1[0]);
        Assertions.assertEquals("97,122" ,ascii2[0]+","+ascii2[1]);
        Assertions.assertEquals("97,101,42" ,ascii3[0]+","+ascii3[1]+","+ascii3[2]);


    }
}
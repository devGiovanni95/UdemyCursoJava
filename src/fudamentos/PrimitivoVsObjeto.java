package fudamentos;

import java.util.Locale;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {
        String s = "texto";
        s = s.toUpperCase();
        System.out.println(s);

        String q = new String("texto2");
        System.out.println(q);

        // Wrappers são as versões objeto dos tipos primitivos

        int a = 123;
        //a.   nao tem notacao de ponto
        //podemos utilizar eles na versao wrapper
    }
}

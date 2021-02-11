package fudamentos;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //byte
        Byte b = 100;
        Short s = 1000;

        // Integer i = Integer.parseInt("1000"); int ===transforma uma string em numero inteiro
        // Integer i = Integer.parseInt(entrada.next());
        Integer i = 10000;  //int
        Long l = 100000L;

        System.out.println(b.byteValue()); //pega o valor antigo
        System.out.println(s.toString());   // transforma como uma string
        System.out.println(s.toString());   // transforma como uma string
        System.out.println(i * 3);
        System.out.println(l / 3);
        System.out.println(l / 3.00);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true"); //tranformando umastring em booleano
        System.out.println(bo);
//      System.out.println(bo.toUpperCase());      nao conseguimos transformar um booleano em letras maiuscula
        System.out.println(bo.toString().toUpperCase());    //neste caso ja conseguimos mudar pois transformamos ele em string
        System.out.println(("" + bo).toLowerCase());          //outro modo de transformar em string

        Character c = '#'; // char
        System.out.println(c + "....");

        entrada.close();

    }
}

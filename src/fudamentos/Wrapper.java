package fudamentos;

import java.util.Scanner;

public class Wrapper {
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

        entrada.close();

    }
}

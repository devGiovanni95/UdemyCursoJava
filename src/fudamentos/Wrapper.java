package fudamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //byte
        byte b = 100;
        Short s = 1000;

        //Integer.parseInt(entada.nextLine());
        Integer i = 10;
        Long l = 100000L;

      //  System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);

        entrada.close();

    }
}
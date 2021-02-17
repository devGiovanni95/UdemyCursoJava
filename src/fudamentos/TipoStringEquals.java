package fudamentos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next(); //o next()  automaticamente retira os espaços em branco
        System.out.println("2" == s2.trim()); // .trim() retira os espaco em branco digitados na entrada
        System.out.println("2".equals(s2.trim()));
        System.out.println("2".equals(s2));

        String s3 = entrada.nextLine();  // o nextLine nao retira os espaços por isso usamos o trim para fazer essa retirada
        System.out.println("2" == s2.trim());  // .trim() retira os espaco em branco digitados na entrada
        System.out.println("2".equals(s2.trim()));
        System.out.println("2".equals(s2));

    }
}


package oo.heranca.teste;

import oo.heranca.desafio2.Carro;
import oo.heranca.desafio2.Civic;
import oo.heranca.desafio2.Ferrari;

public class CarroTeste  {

    public static void main(String[] args) {

        Carro c1 = new Civic();

        c1.acerelar();
        System.out.println(c1);

        c1.acerelar();
        System.out.println(c1);

        c1.frear();
        System.out.println(c1);

        Ferrari c2 = new Ferrari(330);

        c2.acerelar();
        System.out.println(c2);

        c2.acerelar();
        System.out.println(c2);
        c2.acerelar();
        System.out.println(c2);
        c2.acerelar();
        System.out.println(c2);
        c2.acerelar();
        System.out.println(c2);
        c2.frear();
        System.out.println(c2);
//        c2.acerelar();
//        System.out.println(c2);
//        c2.acerelar();
//        System.out.println(c2);
//        c2.acerelar();
//        System.out.println(c2);
//        c2.acerelar();
//        System.out.println(c2);
//        c2.acerelar();
//        System.out.println(c2);
//        c2.acerelar();
//        System.out.println(c2);
//        c2.acerelar();
//        System.out.println(c2);
//        c2.acerelar();
//        System.out.println(c2);

    }
}

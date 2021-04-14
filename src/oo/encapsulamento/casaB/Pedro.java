package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcesso() {
        //segredo
        //facoDentroDeCasa
        //formaDeFalar
        //todosSabem

        //como recebemos por heranca da classe de ANA nao precisamos intanciar uma nava ana
        //so acessar diretamente
//        Ana mae = new Ana();


//        System.out.println(segredo);
//        System.out.println(facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }
}

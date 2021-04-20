package oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.1);

        //exemplos de classes abstratas


//        Comida ingrediente3 = new Comida(0.3);
        //como transfomamos a classe Comida em abstrata nao podemos instanciar mais ela podemos fazer o seguinte:

        Comida ingrediente3 = new Arroz(0.3);


        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);

        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());
        System.out.printf("%.2f.",convidado.getPeso());

    }
}

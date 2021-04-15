package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

//        Pessoa p1 = new Pessoa(-30);
////        p1.idade = - 30;  // alterar
//        p1.alteraIdade(20); // alterar
//
//
//        System.out.println(p1.lerIdade());  // ler
           Pessoa p1 = new Pessoa("Rian","Almeida", -30);
//        p1.idade = - 30;  // alterar
        p1.setIdade(-20); // alterar


        System.out.println(p1.getIdade());  // ler
        System.out.println(p1); // chama o toString
        System.out.println(p1.getNomeCompleto());
    }
}

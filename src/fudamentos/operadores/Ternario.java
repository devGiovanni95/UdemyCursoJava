package fudamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 8.6;
        //                               comparacao         true      :     false
        String resultadoParcial = media >= 5.0 ? "Em recuperação" : "Reprovado";
        String resultadoFinal = media >= 7.0 ? "Aprovado." : resultadoParcial;

        System.out.println("O aluno está " + resultadoFinal);

//        double nota = 9.9;
//        boolean bomComportamento = false;
//        boolean passouPorMedia = nota >= 7;
//        boolean temDesconto = bomComportamento && passouPorMedia;
//        String resultado = temDesconto ? "Sim" : "Não";
//
//        System.out.println("Tem desconto? " + resultado);

        boolean bomComportamento = true;
        boolean passouPorMedia = media >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim" : "Não";

        System.out.println("Tem desconto? " + resultado);
        System.out.printf("Tem desconto? %s " , resultado);
    }
}

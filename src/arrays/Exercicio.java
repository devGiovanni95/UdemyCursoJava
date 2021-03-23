package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4]; // os [] pode ser usado deois do nome da variavel notasAlunoA
        System.out.println(Arrays.toString(notasAlunoA)); // é iniciado com os valores padroes

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(notasAlunoA);
        Arrays.toString(notasAlunoA);
        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);//pega a primeira
        System.out.println(notasAlunoA[notasAlunoA.length -1]);// vai pegar a ultima nota
//        System.out.println(notasAlunoA[4]);    da erro pois a posicao 4 no array nao existe neste exemplo
//        só tem do 0 ao 3 num total de 4 posições

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
      }
//      utilizando o notasAlunos.lenght ele pega automaticamente o numero de arrays criado
//      para que quando mude nao precise alterar quando aumentar o numero de arrays
//
//        for (int i = 0; i < 3; i++) {
//            totalAlunoA += notasAlunoA[i];
//        }
        double media = totalAlunoA / notasAlunoA.length; // totalAlunoA / 3;
        System.out.println(media);

        final double notaArmazenada = 5.9;
        double notaArmazenada1 = 10;

        double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, notaArmazenada1 };

        double totalAlunosB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunosB += notasAlunoB[i];
        }
        System.out.println(totalAlunosB / notasAlunoB.length);
     }
}

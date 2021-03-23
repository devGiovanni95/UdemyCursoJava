package arrays;

import java.util.Arrays;

public class ExercicioForeach {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4]; // os [] pode ser usado deois do nome da variavel notasAlunoA
        System.out.println(Arrays.toString(notasAlunoA)); // é iniciado com os valores padroes

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0;
        for (double total : notasAlunoA ) {
       //     totalAlunoA += total[];
        }

        double media = totalAlunoA / notasAlunoA.length;
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

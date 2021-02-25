package controle.ExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = dados.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = dados.nextDouble();

        double media = (nota1 + nota2) / 2;



        if (media >= 7 && media <= 10) {
            System.out.println("O aluno teve a média de " + media + " e foi Aprovado");
        } else if (media < 7 && media >= 4) {
            System.out.println("O aluno teve a média de " + media + " e esta de Recuperação");
        } else if (media < 4 && media >= 0) {
            System.out.println("O aluno teve a média de " + media + " e foi Reprovado");
        }else {
            System.out.println("Por favor reveja os dados e tente novamente");
        }

    }
}

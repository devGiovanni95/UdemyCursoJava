package controle.ExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int number = entrada.nextInt();

        for (int i = number; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("O numero escolhido está entre os numero pre-definido e é par = " + i);
                break;
            }
        }

    }
}

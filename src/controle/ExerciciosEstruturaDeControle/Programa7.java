package controle.ExerciciosEstruturaDeControle;

import java.util.Scanner;

public class Programa7 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println(" Digite um numero: ");
        int numero = dados.nextInt();

        while (numero >= 0 ){
            int soma = 0 + numero;

            System.out.println(soma);
        }
    }
}

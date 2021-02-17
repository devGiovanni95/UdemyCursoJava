package fudamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * %

        Scanner dadosOperacao = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double num1 = dadosOperacao.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = dadosOperacao.nextDouble();

        System.out.println("Digite o operador sendo + - / * ");
        String operador = dadosOperacao.next();

        //Lógica

        double resultado = "+".equals(operador) ? num1 + num2 : 0;
         resultado = "-".equals(operador) ? num1 - num2 : resultado;
         resultado = "*".equals(operador) ? num1 * num2 : resultado;
         resultado = "/".equals(operador) ? num1 / num2 : resultado;
         resultado = "%".equals(operador) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f ", num1, operador, num2, resultado);
        dadosOperacao.close();



    }
}

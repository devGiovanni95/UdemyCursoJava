package fudamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        //Nao deu certo pois necessita usar a opcao de REPLACE para trocar a virgula por ponto.
        Scanner dados = new Scanner(System.in);

        System.out.println(" Bem vindo a calculadora de média de salario \n" +
                " Digite seus ultimos 3 salarios que voce recebeu");

        System.out.println("Digite o primeiro salario: ");
        String salario1 = dados.nextLine();
        System.out.println("Digite o primeiro salario: ");
        String salario2 = dados.nextLine();
        System.out.println("Digite o primeiro salario: ");
        String salario3 = dados.nextLine();

        double sal1 = Double.parseDouble(salario1);
        double sal2 = Double.parseDouble(salario2);
        double sal3 = Double.parseDouble(salario3);

        double soma = sal1 + sal2 + sal3;
        double media = soma / 3;
        System.out.println(" A média de salario é de R$: " + media);

        dados.close();
    }
}

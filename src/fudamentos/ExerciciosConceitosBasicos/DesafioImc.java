package fudamentos.ExerciciosConceitosBasicos;

public class DesafioImc {
    public static void main(String[] args) {
        double peso = 88.7;
        double altura = 1.75;

        double alturaAoQuadrado = Math.pow(altura, 2);

        double imc = peso / alturaAoQuadrado;

        System.out.printf("O resultado do IMC é de : %.2f",imc );

        System.out.println("         ");
        System.out.println("\n" +
                "IMC\tCategoria\n" +
                "abaixo de 16,00\tBaixo peso Grau III\n" +
                "16,00 a 16,99\tBaixo peso Grau II\n" +
                "17,00 a 18.49\tBaixo peso Grau I\n" +
                "18,50 a 24,99\tPeso ideal\n" +
                "25,00 a 29,99\tSobrepeso\n" +
                "30,00 a 34,99\tObesidade Grau I\n" +
                "35,00 a 39,99\tObesidade Grau II\n" +
                "40,0 e acima\tObesidade Grau III");

    }
}

package fudamentos.ExerciciosConceitosBasicos;

public class DesafioElevar {
    public static void main(String[] args) {

        double numeroX = 10;

        double quadrado = Math.pow(numeroX, 2);
        double cubo = Math.pow(numeroX, 3);

        System.out.printf("O numero %.2f ao quadrado equivale á %.2f. E ao cubo %.2f",numeroX, quadrado, cubo);
    }
}

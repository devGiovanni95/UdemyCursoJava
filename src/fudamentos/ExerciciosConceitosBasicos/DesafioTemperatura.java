package fudamentos.ExerciciosConceitosBasicos;

public class DesafioTemperatura {
    public static void main(String[] args) {

        double celsius = 26;
        final double Fatordivisor =  9 / 5.0;
        final double FatorAjuste = 32;

        double conversao = ( celsius * Fatordivisor) + FatorAjuste;

        System.out.printf("A temperatura %f°C . Equivale a %.2f°F",celsius, conversao);

    }
}

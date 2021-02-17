package fudamentos.ExerciciosConceitosBasicos;

public class DesafioTemperatura2 {
    public static void main(String[] args) {

        double fahrenheit = 78.80;
        final double Fatordivisor =  5 / 9.0;
        final double FatorAjuste = 32;

        double conversao = ( fahrenheit - FatorAjuste) * Fatordivisor;

        System.out.printf("A temperatura %.2f°F . Equivale a %.2f°C",fahrenheit, conversao);

    }
}

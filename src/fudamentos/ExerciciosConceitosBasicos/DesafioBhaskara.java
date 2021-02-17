package fudamentos.ExerciciosConceitosBasicos;

public class DesafioBhaskara {
    public static void main(String[] args) {
        double a = 1;
        double b = 12;
        double c = -13;

        double bAoQuadrado = Math.pow(b, 2);
        double delta = bAoQuadrado - (4*a*c);
        System.out.println(delta);
    }
}

package fudamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        System.out.println(2 + 3);

        double raio = 3.4;
        final double PI = 3.14159;
        /*colocando o final na frente da varilvel a deixa uma constante
         não podendo alterar o valor de pi */
        double area = PI * raio * raio;
        System.out.println(area);

        /*
        pi = 1; da erro pois colocamos a variavem pi como uma constante ,
         sendo assim nao podemos mais mudar o seu valor
         */

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Areá = " + area);
    }
}
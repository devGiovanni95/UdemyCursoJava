package classe;

public class AreaCirc {

    double raio;
    //double pi;   // static double pi = 3.14; podemos declarar ja aqui
//    static double pi = 3.14; // para nao poder ser trocado o valor da variavel colocamos o final para definir como uma constante

    final static double PI = 3.14;
    AreaCirc(double raioInicial) {
//        pi = 3.14;
        raio = raioInicial;
    }

    double area() {
        //o math ja é um metodo da classe por isso nao precisa criar uma nova instancia
        //Math m = new Math();
//        return pi * Math.pow(raio, 2);
        return PI * Math.pow(raio, 2);
    }

    static double area(double raio) {
        return  PI * Math.pow(raio, 2);
    }
}

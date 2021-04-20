package oo.polimorfismo;

  // para que comidca nao possa ser intanciada definimos ela para uma classe abstrata
//public class Comida {
public abstract class Comida {
    private double peso;

    public Comida(double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0){
            this.peso = peso;
        }
    }
}

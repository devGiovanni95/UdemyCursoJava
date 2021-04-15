package oo.heranca.desafio2;

public class Carro {

    //colocando como visibidade publica pois é um a constante e seu valor nao muda
    public final int VELOCIDADE_MAXIMA;
    //colocando para ser um dados que pode ser herdado
    protected int velocidadeAtual;
//    protected int delta = 5;
    private int delta = 5;

    //colocando pro metodo ser protected para que possa ser herdado por uma outra classe, assim podendo acessa-la

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    //colocando pro metodo ser publico para qualquer outra classe poder acessar
    public void acerelar(){
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += getDelta();
        }
    }

    //colocando pro metodo ser publico para qualquer outra classe poder acessar
    public void frear(){
        if (velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else {
            velocidadeAtual = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public String toString(){
        return "Velocidade atual é " + velocidadeAtual + " Km/h.";
    }
}

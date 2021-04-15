package oo.heranca.desafio2;

public class Ferrari extends Carro implements Esportivo, Luxo {


//    private boolean ligarTurbo;
    private boolean ligarTurbo = false;  //e a mesma coisa da decima pois so foi gerada
    private boolean ligarAr;

    //colocando pro metodo ser publico para qualquer outra classe poder acessar
    public Ferrari() {
        this(315);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
//        setDelta(15);
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
//        setDelta(15);
        ligarTurbo = false;

    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;

    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        }else  {
            return 15;
        }
    }

    //  @Override
//  mostra que voce realmente esta sobreescrevendo o metodo
//
//    @Override
//    void acerelar() {
//        velocidadeAtual += 15;
//    }

//podemos aumentar o nivel de visibilidade nos casos de sobrescrever metodos,
// neste caso colocando de protected para public ae nao da nenhum erro
// mas se fossemos diminuir o nivel de acesso ae daria um erro


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
}

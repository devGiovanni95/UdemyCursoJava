package oo.heranca;

public class Jogador {

    public int vida = 100;
    public int x;
    public int y;

    //para garantir que outras classes possam herdar o metodo jogador deixamos ele como protected
    protected Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //colocando pro metodo ser publico para qualquer outra classe poder acessar
    public boolean atacar(Jogador oponente) {

        int deltaX = Math.abs(x - oponente.x); // math absoluto nao importa se o numero e positivo ou negativo
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }

    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;

            case LESTE:
                x++;
                break;

            case SUL:
                y++;
                break;

            case OESTE:
                x--;
                break;

        }
        if (direcao == Direcao.NORTE) {
            y++;
        }
        return true;
    }

//    boolean andar(Direcao direcao) {
//        if (direcao == Direcao.NORTE) {
//            y++;
//        }
//        return true;
//    }

//    boolean andar(int direcao) {
//        if (direcao == 1) {
//            y++;
//        }
//        return true;
//    }


//    boolean andar(String direcao){
//        if("norte".equalsIgnoreCase(direcao)) {
//            y++;
//        }
//        return true;
//    }
}

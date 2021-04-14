package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

//        Jogador monstro = new Jogador();
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

//        Jogador heroi = new Jogador();
        Heroi heroi = new Heroi(10,11);

//como ja declaramos na implementação do construtor nao precisamos mais declarar eles aqui
//        heroi.x = 10;
//        heroi.y = 11;

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        // nao deu certo a troca de posicao
        //  monstro.andar(Direcao.NORTE);   // ataca 3 vezes e depois disso nao ataca mais pois o monstro mudou de posição

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);


        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);


//        monstro.andar(Direcao.NORTE);
//        monstro.andar(Direcao.LESTE);
//        monstro.andar(Direcao.NORTE);
//        monstro.andar(Direcao.LESTE);
//        monstro.andar(Direcao.NORTE);
//        monstro.andar(Direcao.NORTE);


//        monstro.andar(1);
//        monstro.andar(1);
//        monstro.andar(3);
//        monstro.andar(1);
//        monstro.andar(1);
//        monstro.andar(1);
//        monstro.andar(1);

//        monstro.andar("norte");
//        monstro.andar("norte");
//        monstro.andar("norte");
//        monstro.andar("norte");
//        monstro.andar("norte");
//
//        System.out.println(monstro.y);
    }
}

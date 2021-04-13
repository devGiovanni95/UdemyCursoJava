package oo.heranca;

public class Jogo {
    public static void main(String[] args) {

//        Jogador j1 = new Jogador();
        Monstro j1 = new Monstro();
        j1.x = 10;
        j1.y = 10;

//        Jogador j2 = new Jogador();
        Heroi j2 = new Heroi();
        j2.x = 10;
        j2.y = 11;

        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println(j1.vida);
        System.out.println(j2.vida);
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.LESTE);
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.LESTE);
//        j1.andar(Direcao.NORTE);
//        j1.andar(Direcao.NORTE);


//        j1.andar(1);
//        j1.andar(1);
//        j1.andar(3);
//        j1.andar(1);
//        j1.andar(1);
//        j1.andar(1);
//        j1.andar(1);

//        j1.andar("norte");
//        j1.andar("norte");
//        j1.andar("norte");
//        j1.andar("norte");
//        j1.andar("norte");
//
//        System.out.println(j1.y);
    }
}

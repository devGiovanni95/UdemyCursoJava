package oo.heranca;

public class Monstro extends  Jogador{

//    Monstro(){
//        super(0,0);
//    }

    //este contrutor esta chamando o construtor abaixo
    Monstro(){
        this(0,0);
    }

    // Este construtor esta chamando o construtor da classe PAI
    Monstro(int x, int y){
        super(0,0);
    }
}

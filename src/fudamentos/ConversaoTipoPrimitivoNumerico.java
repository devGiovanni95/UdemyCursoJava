package fudamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1;    // conversao implicita pois o numero 1 cabe dentro de um double
        System.out.println(a);

        // nao suporta o numero inteiro  até a ultima casa ja no double ele aguenta
        float b = (float) 1.2345678989;   //maneira explicita   --> "cast"
        System.out.println(b);
        float b1 = 1.23456789898F;
        System.out.println(b1);
        double a1 = 1.23456789898F;
        System.out.println(a1);

        int c = 340;    //quando chega a um determinado numero ele pode alterar o resultado pois há uma perda de dados pela conversão
        byte d = (byte) c;  // explicita(CAST)
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e; // explicita(CAST)     na conversao ele arredonda sempre pra baixo no caso deste vai para 1
        System.out.println(f);

    }
}

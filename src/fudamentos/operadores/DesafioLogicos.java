package fudamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        //Trabalho na terça (V ou F)
        //Trabalho na quinta (V ou F)

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        if (trabalho1 && trabalho2 && true) {
            System.out.println("Comprou a televisão de 50 polegadas");
        }else{
            System.out.println("Comprou a televisão de 32 polegadas");
        }

        if (trabalho1 || trabalho2) {
            System.out.println("A familia vai tomar sorvete no shopping");
        }else {
            System.out.println("A familia não vai tomar sorvete no shopping");
        }
    }
}

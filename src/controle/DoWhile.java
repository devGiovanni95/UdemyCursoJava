package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        // if (....) setença; ou {}
        // while (....) setença; ou {}
        // for(...;...;...) setença; ou {}

        //do{} while(...);


        Scanner entrada = new Scanner(System.in);

        String texto = "por favor";

        // o do while fara com que ele seje executado pelo menos uma vez antes de fechar o comando mesmo que
        // ja digite para sair logo de cara,  pois nmo for ou if se digitar para sair nem executar ele executa
        do {
            System.out.println("Você precisar falar as palavras magicas ....");
            System.out.println("Quer sair ? ");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!!");
        entrada.close();
    }
}

package controle;

public class Break {

    public static void main(String[] args) {

        //o for a sua função principal era de rodar o i com valor inicial até o 10
        //mas como adicionamos o if com a função break no meio da linha do codigo do FOR
        //ele vai incrementando até chegar no numero 5 ae ele forca o programa a fechar e
        // ir para o proximo bloco de codigo

        for (int i = 0; i < 10; i++){

            if(i == 5){
                break;
            }

            System.out.println(i);
        }
        System.out.println("Fim");
    }
}

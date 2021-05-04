package streams;

import java.util.function.UnaryOperator;
//poderiamos declarar ela sendo como uma interface para que
// nao possa ser instanciada ou modificado posteriomente no codigo
//teriamos somente que retirar o FINAL da funcao GRITO


public class Utilitarios {

    //deste modo tambem deixando o construtor privado se alguem
    // tentar instanciar o construtor nao deixaria por ser privado
    private Utilitarios(){

    }

    public static final UnaryOperator<String> maiusculas =
            n -> n.toUpperCase();

    public static final UnaryOperator<String> primeiraLetra =
            n -> n.charAt(0) +"";

    public static final String grito(String n){
        return n + "!!!!  " ;
    }
}

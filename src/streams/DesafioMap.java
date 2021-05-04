package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        /*
        * 1. Número para string binária..... 6 =>  "110"
        * 2. INVERTER A STRING ... "110" => "011"
        * 3. Converter de volta para inteiro +> "011" => 3
         */

        //reverte a posicao da sequencia de traz pra frente *2
        UnaryOperator<String> inverter =
            numeroEmTexto -> new StringBuilder(numeroEmTexto).reverse().toString();

        //Converter de volta para inteiro
        Function<String, Integer> binarioParaInt =
                numeroEmTexto -> Integer.parseInt(numeroEmTexto, 2 );//colocando o 2 entende-se que esta transformando um numero binario
        nums.stream()
                .map(Integer::toBinaryString) // converter numero para string binaria*1
                .map(inverter)//passa os valores ja invertido
                .map(binarioParaInt) //passa os valores convertido
                .forEach(System.out::println); // operacao de terminação
    }
}

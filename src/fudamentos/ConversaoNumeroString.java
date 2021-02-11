package fudamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println(num1.toString().length()); //transformou em string para usar o lenght para saber a quantidade de numero
//      System.out.println(num1.length());  // se quisermos saber a quantidade nao temos acesso por ser um numero

        //outro modo de converter para string
        int num2 = 200000;
        System.out.println(Integer.toString(num2).length());

        System.out.println(("" + num1).length());
        System.out.println(("" + num2).length());
    }
}

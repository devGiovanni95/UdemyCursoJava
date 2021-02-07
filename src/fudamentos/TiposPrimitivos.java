package fudamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        /*
        tipos primitivos
        byte - tamanho memoria 1
        short - tamanho memoria  2
        int - tamanho memoria  4
        long - tamanho memoria  8

        byte ->> -128 ate +127
        short ->> +- 32.767
        int ->> +- 2.000.000
        long ->> + de 2.000.000

         1 byte = 8bits

         float ->> 4
         double ->> 8

         char ->> 1 caractere
         boolean ->> false or true

         */
        //Informações do funcionario

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        //Tipos  numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false; // true

        //tipo caractere
        char status = 'A'; //ativo

        //Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Números de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + " : ganha -> " + salario);
        System.out.println("Férias ? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}

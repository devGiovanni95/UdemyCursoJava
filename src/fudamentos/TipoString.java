package fudamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));//charAt(2) vai escolher o segundo indice da string

        // No uso da String não conseguimos mudar seu valor somento deixar tudo maiusculo ou minusculo
        String s ="Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "???");
        System.out.println(s.startsWith("Boa")); //começa com
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("Boa"));
        System.out.println(s.endsWith("tarde")); //termina com
        System.out.println(s.endsWith("Tarde")); //termina com
        System.out.println(s.length());//tamanho da string
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome +
                "\nIdade: " + idade + "\nSalario: " + salario + "\n\n";

        System.out.println(maisUmaFrase);

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome +
                "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");

        //%s string
        //%d inteiros
        //%f float  %.2f formatado para 2 casas depois do ponto
        //%n pula uma linha

        System.out.printf("O senhor %s %s tem %d anos  e ganha R$ %.2f.",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos  e ganha R$ %.2f.",
                nome, sobrenome, idade, salario  );

        System.out.println(frase);


        System.out.println("Frase qualquer".contains("qual"));   // dentro da frase comtem a palavra .....
        System.out.println("Frase qualquer".indexOf("qual"));  //o indice de onde comeca qual
        System.out.println("Frase qualquer".substring(6)); // começa a partir do indice fornecido
        System.out.println("Frase qualquer".substring(6,8));  // comeca do indice mostrado e termina no outro indice fornecido

    }
}

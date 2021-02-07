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


    }
}

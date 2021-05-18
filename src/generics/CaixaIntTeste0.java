package generics;

public class CaixaIntTeste0 {

    public static void main(String[] args) {

        CaixaInt0<String> caixaA = new CaixaInt0<>();
        caixaA.guardar("Teste");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

    }
}

package generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {
//da erro por definirmos a classe como heranca de Number
//        CaixaNumero<String> caixaA = new CaixaNumero<String>();
//        caixaA.guardar("Teste");


        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(2.3);
        System.out.println(caixaA.abrir());

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(123);
        System.out.println(caixaB.abrir());
    }
}
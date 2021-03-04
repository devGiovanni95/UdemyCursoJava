package classe;

public class ProdutoTeste1 {
    public static void main(String[] args) {

 //       exemplo de chamada de construtor
//        int a = 3;
//        Scanner entrada = new Scanner(System.in);

        Produto1 p1 = new Produto1();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto1();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2 );

        System.out.printf("Média do carrinho = R$ %.2f.", mediaCarrinho);
    }
}

package classe;

public class ProdutoTesteDesafio {
    public static void main(String[] args) {

//       exemplo de chamada de construtor
//        int a = 3;
//        Scanner entrada = new Scanner(System.in);

        ProdutoDesafio p1 = new ProdutoDesafio();
        p1.nome = "Notebook";
        p1.preco = 4356.89;

        var p2 = new ProdutoDesafio();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        //ele esta alterando o desconto total do produto alterando o valor de todos os descontos

        ProdutoDesafio.desconto = 0.50;

        var p3 =new ProdutoDesafio("Caneca", 22.25);

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p1.nome + " " + p2.precoComDesconto());
        System.out.println(p1.nome + " " + p3.precoComDesconto());


        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double precoFinal3 = p3.precoComDesconto();
        double mediaCarrinho = ((precoFinal1 + precoFinal2 + precoFinal3) / 3);

        System.out.printf("Média do carrinho = R$ %.2f.", mediaCarrinho);
    }
}

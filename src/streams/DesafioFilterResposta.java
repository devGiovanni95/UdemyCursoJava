package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterResposta {
    public static void main(String[] args) {


        ProdutoSiteResposta produto1 = new ProdutoSiteResposta("Notebook",2598.50,30,0.29);
        ProdutoSiteResposta produto2 = new ProdutoSiteResposta("Celular",1200,0,0.30);
        ProdutoSiteResposta produto3 = new ProdutoSiteResposta("Televisao",1500,30,0.20);
        ProdutoSiteResposta produto4 = new ProdutoSiteResposta("Guitarra",2500,0,0.39);
        ProdutoSiteResposta produto5 = new ProdutoSiteResposta("Amplificador",1205,30,0.25);

        List<ProdutoSiteResposta> produto = Arrays.asList(produto1,produto2,produto3,produto4,produto5);


        Predicate<ProdutoSiteResposta> superPromocao = p -> p.deconto >= 0.30;
        Predicate<ProdutoSiteResposta> freteGratis = p -> p.freteGratis == 0 ;
        Predicate<ProdutoSiteResposta> produtoRelevante = p -> p.preco >= 500;

        Function<ProdutoSiteResposta, String> chamadaPromocional =
                p -> "Aproveite! " + p.nomeProduto + " por R$" + p.preco;

        //pipe line de execuçaõ
        produto.stream()

                .filter(superPromocao)
                .filter(freteGratis)
                .filter(produtoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);

    }
}

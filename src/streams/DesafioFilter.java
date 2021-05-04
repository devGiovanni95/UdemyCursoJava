package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {


        ProdutoSite produto1 = new ProdutoSite("Notebook",2598.50,false,0.29);
        ProdutoSite produto2 = new ProdutoSite("Celular",1200,true,0.30);
        ProdutoSite produto3 = new ProdutoSite("Televisao",1500,false,0.20);
        ProdutoSite produto4 = new ProdutoSite("Guitarra",2500,true,0.39);
        ProdutoSite produto5 = new ProdutoSite("Amplificador",1205,false,0.25);

        List<ProdutoSite> produto = Arrays.asList(produto1,produto2,produto3,produto4,produto5);


        Predicate<ProdutoSite> desconto = a -> a.deconto >= 0.30;
        Predicate<ProdutoSite> freteGratis = a -> a.freteGratis;

//        Function<ProdutoSite, Double> precoFinal = a -> a.preco * ( 1 - a.deconto);
        Function<ProdutoSite, String> nomeproduto = a -> a.nomeProduto + " com o preco de " +
                (a.preco * ( 1 - a.deconto));

        produto.stream()
                .filter(desconto)
                .filter(freteGratis)
                .map(nomeproduto)
                .forEach(System.out::println)
        ;



    }
}

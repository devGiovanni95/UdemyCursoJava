package streams;

public class ProdutoSiteResposta {
    final String nomeProduto;
    final double preco;
    final double freteGratis;
    final double deconto;


    public ProdutoSiteResposta(String nomeProduto, double preco, double freteGratis, double deconto) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.freteGratis = freteGratis;
        this.deconto = deconto;
    }
}

package streams;

public class ProdutoSite {
    final String nomeProduto;
    final double preco;
    final boolean freteGratis;
    final double deconto;


    public ProdutoSite(String nomeProduto, double preco, boolean freteGratis, double deconto) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.freteGratis = freteGratis;
        this.deconto = deconto;
    }
}

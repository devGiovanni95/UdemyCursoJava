public class Produto {
    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        super();//pode chamar ou nao  , noi caso nao precisa por ser da classe Object que e padrao do java
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return  nome + " tem preço de R$" + precoFinal;
    }
}

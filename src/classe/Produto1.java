package classe;

public class Produto1 {
    String nome;
    double preco;
    double desconto;

// tipo precoComDesconto(......parametros) {}
// no caso de ter um outro desconto para funcionarios ou par agerente podemos colocar
// dentro das () como parametro para que seja obrigatorio a sua imolementação
//

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }

}

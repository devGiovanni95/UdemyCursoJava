package classe;

public class Produto1 {
    String nome;
    double preco;
    double desconto;

//   tipo precoComDesconto(......parametros) {}
   double precoComDesconto(){
       return preco * (1 - desconto);
    }
}

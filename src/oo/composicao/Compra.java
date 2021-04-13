package oo.composicao;

import java.util.ArrayList;

public class Compra {

    //bidirecional

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();
//para nao precisarmos adicionar itens criando new item mas so colocando os dados do cliente
    void adicionarItem(String nome, int quantidade, double preco){
      this.adicionarItem(new Item(nome, quantidade, preco));
    }

    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this;
    }
    double obterValorTotal(){
        double total = 0;

        for (Item item: itens){
            total += item.quantidade * item.preco;
        }

        return total;
    }

    //unidirecional

//    String cliente;
//    ArrayList<Item> itens = new ArrayList<Item>();
//
//    double obterValorTotal(){
//        double total = 0;
//
//        for (Item item: itens){
//            total += item.quantidade * item.preco;
//        }
//
//        return total;
//    }
}

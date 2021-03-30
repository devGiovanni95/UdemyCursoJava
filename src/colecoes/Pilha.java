package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pequeno Principe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());// obter o proximo elemento da fila ( sem remover )
        System.out.println(livros.element());// obter o proximo elemento da fila ( sem remover )

        System.out.println(livros.pop());// obter o proximo elemento da fila ( e remover )
        System.out.println(livros.poll());// obter o proximo elemento da fila ( e remover )
        System.out.println(livros.poll());// obter o proximo elemento da fila ( e remover )
        System.out.println(livros.poll());// obter o proximo elemento da fila ( e remover )
//        System.out.println(livros.remove());// obter o proximo elemento da fila ( e remover )
//        System.out.println(livros.pop());// se nao tiver mais objetos na lista ele da um erro exception

//        livros.size();
//        livros.clear();
//        livros.contains("mario");
//        livros.isEmpty(); esta vazia

        for (String livro: livros){
            System.out.println(livro);
        }
    }
}

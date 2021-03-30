package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //Offer e Add -> adicionam elementos na fila
        //Diferença é o comportamento ocorre
        //quando a fila esta cheia!!!
        fila.add("Ana");    //retorna false
        fila.add("Bia");    //Lanca exceção
        fila.add("Carlos");
        fila.add("Daniel");
        fila.add("Rafaela");
        fila.add("Gui");
        System.out.println(fila);

        // Peek e Element -> obter o proximo elemento da fila ( sem remover )

        //A difernça é o comportamento que ocorre quando a fila esta vazia
        //
        System.out.println(fila.peek()); // retorna false ------ null
        System.out.println(fila.peek());
        System.out.println(fila.element());  // Lança uma exceção  ----Exception in thread "main" java.util.NoSuchElementException
        System.out.println(fila.element());

        //Poll e Remove -> obter o proximo elemento
        // da fila e remove!!!

        //Diferença é o comportamento que ocorre quando a fila esta vazia!!!!
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...);


    }
}

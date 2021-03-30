package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
//      ArrayList<Usuario> lista = new ArrayList<>();
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Manu"));

        //depois de criar a classe toString no Usuario ele retorna um texto pre-editado em vez do endereço de memoria
        System.out.println(lista.get(3));//acessa pelo indice
        System.out.println(lista.get(3).nome);

//        lista.remove(1);
//        lista.remove(new Usuario("Manu"));

        System.out.println(">>>>>Removido<<<<<< "+ lista.remove(1));
        System.out.println(lista.remove(new Usuario("Manu")));

        System.out.println("Tem o nome? "+ lista.contains(new Usuario("Lia")));
        System.out.println("Tem o nome? "+ lista.contains(u1));

        for (Usuario u: lista){
            System.out.println(u.nome);
        }

        /*
        //ele implicitamente chama o toString para concatenar com o texto premeditado
        for (Usuario u: lista){
            System.out.println(u);
        }

        for (Usuario u: lista){
            System.out.println(u.toString());
        }*/
    }
}

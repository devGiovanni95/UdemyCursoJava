package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {
        //Set<String> listaAprovados = new HashSet<String>();//sai sem ordenancia sai tudo fora da ordem adicionada
        //Set<String> listaAprovados = new TreeSet<>();
        //SortedSet<String> listaAprovados = new TreeSet<>();
        TreeSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

//        nums.get(1);    Não é possivel acessar pelo indice

        for (int n: nums){
            System.out.println(n);
        }
    }
}

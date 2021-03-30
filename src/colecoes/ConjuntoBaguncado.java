package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //faz o cast sozinho de converção para wrapper
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("teste");//se colocar teste com o'T' maiusculo ae ele nao conta cmo 6 pois ele exclui sozinho
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamnho é " + conjunto.size());

        System.out.println(conjunto.contains('x')); // se o conjunto tem 'x'
        System.out.println(conjunto.contains('1'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));
        System.out.println(conjunto.contains(false));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums);//uniao entre conjuntos
        conjunto.retainAll(nums);  //retem todos os numero do conjunto nums e so mostra os que tem valores igual
        System.out.println(conjunto);
        conjunto.clear();
        System.out.println(conjunto);
    }
}

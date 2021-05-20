package generics;

import java.util.*;

public class Pares<C extends Number, V> {
                                            //HashSet
    private final Set<Par<C, V>> itens = new LinkedHashSet<>();

    public void adicionar(C chave, V valor) {
        if (chave == null) return;

        Par<C, V> novoPar = new Par<C, V>(chave, valor);
//ele ira conferir se o novo par tem chave igual, se tiver ele
// vai remover a antiga e colocar o novo par pois o valor pode ser
// diferente e deste modo ele atualizara o novo valor
        if (itens.contains(novoPar)) {
            itens.remove(novoPar);
        }

        itens.add(novoPar);

//1 opcao
//        if (chave == null) return;
//        itens.add(new Par<C, V>(chave, valor));

//2 opcao
//        if (chave != null){
//            itens.add(new Par<C, V>(chave, valor));
//      }
    }

    public V getValor(C chave){
        if (chave == null) return null;

        Optional<Par<C, V>> parOpcional = itens.stream()
                .filter(par -> chave.equals(par.getChave()))
                .findFirst();

        return parOpcional.isPresent()
                ? parOpcional.get().getValor() : null;
    }
}

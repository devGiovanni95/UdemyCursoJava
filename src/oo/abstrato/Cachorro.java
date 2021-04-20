package oo.abstrato;

public class Cachorro extends Mamifero{

    //como instanciamos na classe mamifero como uma constante que nao muda nao necessityamos implenmentar ele neste momento
//    @Override
//    public String mover() {
//        return super.mover();
//    }

    @Override
    public String mamar() {
        return "Usando Leite";
    }
}

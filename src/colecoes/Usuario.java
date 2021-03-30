package colecoes;

import java.util.Objects;

public class Usuario {

    String nome;

    //construtor para que so crie lista de usuario
    Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + ".";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Usuario usuario = (Usuario) o;
//        return Objects.equals(nome, usuario.nome);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nome);
//    }


    @Override
    public boolean equals(Object o) {
        Usuario outroUsuario = (Usuario) o;
        return  this.nome.equals(outroUsuario.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.length();
    }
//    @Override
//    public int hashCode() {
//        return 0;
//    }
}

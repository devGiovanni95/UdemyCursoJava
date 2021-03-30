package equals;

import java.util.Objects;

public class AUsuario {
    String nome;
    String email;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        AUsuario aUsuario = (AUsuario) o;
//        return Objects.equals(nome, aUsuario.nome) && Objects.equals(email, aUsuario.email);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(nome, email);
//    }

        public boolean equals(Object objeto){
        if (objeto instanceof  AUsuario) {
            AUsuario outro = (AUsuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else {
            return  false;
        }
//hash code sera abordado em outra aula

    }
    public int hashCode(){
        return  this.nome.length();
    }
}

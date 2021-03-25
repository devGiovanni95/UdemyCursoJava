package equals;

public class AUsuario {
    String nome;
    String email;

    public boolean equals(Object objeto){
        if (objeto instanceof  AUsuario) {
            AUsuario outro = (AUsuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else {
            return  false;
        }
    }
}
//hash code sera abordado em outra aula
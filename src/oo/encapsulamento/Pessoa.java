package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private String sobrenome;

    //    public int idade;
    private int idade;

//    public Pessoa(int idade) {
//        //    this.idade = idade;
//        setIdade(idade);//valida a entrada de idade
//    }
    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

//    public int lerIdade() {
//        return idade;
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return getNome() + " " + getSobrenome();
    }
    //Getter
    public int getIdade() {
        return idade;
    }

    //
//    public void alteraIdade(int novaIdade) {
//        if (novaIdade >= 0) {
//            this.idade = novaIdade;
//        }else{
//            System.out.println("Data informada não é valida");
//        }
//    }
//    public void alteraIdade(int novaIdade) {
//        novaIdade = Math.abs(novaIdade);//deixa a idade positiva mesmo sendo digitada como negativa
//        if (novaIdade >= 0 && novaIdade <= 120) {
//            this.idade = novaIdade;
//        }else{
//            System.out.println("Data informada não é valida");
//        }
//    }
    //Setter
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);//deixa a idade positiva mesmo sendo digitada como negativa
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        } else {
            System.out.println("Data informada não é valida");
        }
    }

    @Override
    public String toString() {
        return "Olá eu sou o " + getNome() + " " + getSobrenome()
                + " tenho " + getIdade() + " Anos.";
    }
}
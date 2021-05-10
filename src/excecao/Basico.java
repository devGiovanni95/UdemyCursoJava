package excecao;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imprimirNotaDoAluno(a1);
        } catch (Exception excecaoS) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario");
        }
/*
Exception in thread "main" java.lang.NullPointerException: Cannot read field "nome" because "aluno" is null
	at excecao.Basico.imprimirNotaDoAluno(Basico.java:25)
	at excecao.Basico.main(Basico.java:9)

 */
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();//imprime a pilha de execução
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException k) {
            System.out.println("Ocorreu o erro: "+ k.getMessage());
        }
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at excecao.Basico.main(Basico.java:6)

	excecao esta  na thread(linha,comando) main java.lang.ArithmeticException: / dividido por zero-0
	na linha java 6
         e*/

        System.out.println("Fim :)");

    }

    public static void imprimirNotaDoAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }

}

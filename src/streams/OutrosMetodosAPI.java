package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodosAPI {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 9.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Maria", 10);

        List<Aluno> alunos =
                Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        //criar equals e hashcode para nao duplicar sendo o mesmo endereço de memoria
        System.out.println("distint....");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .limit(2)  //limite de usuarios
                .skip(1)   //pular
                .forEach(System.out::println);

        System.out.println("\nSkip/Limit 2 ");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\nTakeWhile"); //pegar enquanto * se tiver um que nao seja ele para
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }
}

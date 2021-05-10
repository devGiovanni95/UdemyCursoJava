package excecao.personalizadaA;

import excecao.Aluno;
import excecao.personalizadaB.NumeroForaIntervaloException;
import excecao.personalizadaB.StringVaziaException;
import excecao.personalizadaB.Validar;

public class TesteValidacoes {

    public static void main(String[] args) {

//        Aluno aluno = new Aluno("",-7);
//
//        Validar.aluno(aluno);
//
//        System.out.println("FIM :)");
//
//        try {
//            Aluno aluno = new Aluno("",-7);
//            Validar.aluno(aluno);
//        }catch (StringVaziaException e){
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            Aluno aluno = new Aluno("ana",7);
//            Validar.aluno(aluno);
//
//        }catch (StringVaziaException e){
//            System.out.println(e.getMessage());
//        } catch (NumeroForaIntervaloException e ){
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("FIM :)");

        try {
            Aluno aluno = new Aluno("ana",7);
            excecao.personalizadaB.Validar.aluno(aluno);

            Validar.aluno(null);

        }catch (StringVaziaException e){
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException | IllegalArgumentException e ){
            System.out.println(e.getMessage());
        }

        System.out.println("FIM :))");
    }
}

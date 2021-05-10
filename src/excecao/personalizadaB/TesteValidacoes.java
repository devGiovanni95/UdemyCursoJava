package excecao.personalizadaB;

import excecao.Aluno;

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
//
//        try {
//            Validar.aluno(null);
//        } catch (StringVaziaException e) {
//            e.printStackTrace();
//        } catch (NumeroForaIntervaloException e) {
//            e.printStackTrace();
//        }

        System.out.println("FIM :))");
    }
}

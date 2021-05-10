package excecao;

public class ChecadaVsNaoChecada {

//    pra nao gerar erro no codigo
//    public static void main(String[] args) throws Exception {
    public static void main (String[] args) {
//        try {
//            geraErro1();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        try {
            geraErro1();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //geraErro2();
        // para nao gerar erro neste ponto do codigo precisamos
        // ou adicionar a classe main o throws Exceptions ou adicionar um cath no metodo do erro

        try {
            geraErro2();
        }catch (Throwable e ){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    //Exceção Não checada ou Não verificada
    static void geraErro1() {
        //deste modo nao gera um erro mas sim le tudo direto para criar um erro nescessitamos da função throw
//        new RuntimeException("Ocorreu um erro bem legal #01!");
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    //Exceção checada ou verificada

//    static void geraErro2() {
//        new Exception("Ocorreu um erro bem legal #02!");
//    }
    static void geraErro2() throws Exception{
       throw new Exception("Ocorreu um erro bem legal #02!");
    }
//
//    static void geraErro2()  {
//       try {
//           throw new Exception("Ocorreu um erro bem legal #02!");
//       } catch (Exception e){
//           System.out.println("Que legal");
//       }
//    }
}

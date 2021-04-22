package lambdas;

@FunctionalInterface
public interface Calculo {

    //    public  abstract double executar(double a, double b);
    double executar(double a, double b);


//Quando utilizamos o metodo default nao geramos erro na FunctionaInterface
//mas se utilizarmos outro metodo ja teriamos problemas

    default String legal(){
        return "Legal";
    }//posso acessar os metodos aqui dentro

    //uma outra possibilidade e incrementar um metodo estatico
    static String muitoLegal(){
        return "Muito legal";
    }//ja aqui nao da pra acessar os metodos
}

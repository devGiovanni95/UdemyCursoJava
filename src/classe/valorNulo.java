package classe;

public class valorNulo {
    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!!!!"));
        // ele concatenou pois tinha um valor na string mesmo vazio ele conta

//        String s2 ;
//        System.out.println(s2.concat("!!!!!!")); //java: variable s2 might not have been initialized

        //erro de compilação na hora que o programa esta sendo executado
        String s3 = null ;
        System.out.println(s3.concat("!!!!!!"));
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.concat(String)" because "s3" is null
        //at classe.valorNulo.main(valorNulo.java:14)
    }
}

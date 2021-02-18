package controle;

public class For1 {
    public static void main(String[] args) {

//        int contador = 0;
//        while (contador <= 20) {
//            System.out.printf("i = %d\n", contador);
//            contador += 2;
//        }

/*
      for (a;b;c)

        a = definicao da variavel =>     int contador = 0
        b = expressao =>                 contador <= 20
        c = incremento =>                contador ++
  */

        for (int contador = 0; contador <= 20; contador++) {
            System.out.printf("i = %d\n", contador);
        }

        //laco infinito
        /*
       int x = 2;
        for (;x<10;) {
            System.out.println("x = " + x);
        }

        for (;;) {
            System.out.println("Fim");
        }
        */

    }
}

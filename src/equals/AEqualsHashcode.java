package equals;

import java.util.Date;

public class AEqualsHashcode {

    public static void main(String[] args) {
        AUsuario u1 = new AUsuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@gmail.com";


        AUsuario u2 = new AUsuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
        System.out.println(u2.equals(u2)); // da verdadeiro pois o endereco de memoria e igual

        //adicionando uma nova classe

        System.out.println(u2.equals(new Date()));
    }
}

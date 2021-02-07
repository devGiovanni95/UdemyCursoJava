package fudamentos;

import java.util.Locale;

public class NotacaoPonto {

    public static void main(String[] args) {
        String s = "Bom dia X";
        System.out.println(s);

        s = s.replace("X","Senhora");
        System.out.println(s);

        s = s.concat("!!!!");
        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);

        x = x.toLowerCase(Locale.ROOT);
        System.out.println(x);

        String y = "Bom dia X".replace("X","Giovanni").toUpperCase().concat(" !!!#!!!");
        System.out.println(y);

        //Tipos primitivos não tem o operador "."
        int a = 3;
        System.out.println(a);
    }
}

package fudamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a = a + 1;
        a--; // a = a - 1;

        ++b; // b = b + 1;
        --b; // b = b - 1;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini desafio.....");
        System.out.println(++a == b--);  // ele faz adicao de 1 no A pois esta antes do = mas depois compara os dois numeros pra depois decrementar o B
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);

    }
}

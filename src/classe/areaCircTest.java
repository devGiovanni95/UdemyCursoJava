package classe;

public class areaCircTest {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        // a1.pi = 1000; da zro pois nao podemos alterar o pi deste modo

        AreaCirc a2 = new AreaCirc(5);
        // a2.pi = 0;

//        AreaCirc.pi = 3.1415;

        System.out.println(a1.area());
        System.out.println(a2.area());

//        AreaCirc.pi = 10;

        System.out.println(a1.area(100));
        System.out.println(a2.area());
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);//mostra o pi da classe math do proprio java
    }
}

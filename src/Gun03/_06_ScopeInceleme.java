package Gun03;

public class _06_ScopeInceleme {
    public static void main(String[] args) {
        int a=5; //a degeri asagidaki parantez bolgesinde gecerli olur
        { // bu parantez arası kendine ozel bolge olusturur ve buyrada tanımlanan degıskenler sadece burada gecerli olur. Kullanım amaci karisikligi azaltmak.

            int b = 5;
            b = 77;
            a = 8;

            System.out.println("b = " + b);
        }

        int b=12;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

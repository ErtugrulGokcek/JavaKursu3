package Gun03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        int sayi;
        byte byteDeger=127;
        short shortDeger=32767;
        int intDeger=25000000; //int birkaç milyara kadar gidiyor
        long longDeger=232232323222L; //int icin cok buyuk yanına L koayarak long olduğunu soyluyoruz

        float floatDeger=3.14F; // ondalık sayıları default olarak double kabul eder, sonuna F eklendiginde sayıya hicbir etkisi yoktur
        double doubleDeger=3.14; // her iki tarafta double oldugundan ek bir bilgiye ihtiyac olmadı

        char basHarf='A';
        boolean evetMi= true;

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("evetMi = " + evetMi);


    }
}

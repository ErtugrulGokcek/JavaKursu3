package Gun06;

public class _04_StringIndexOf {
    public static void main(String[] args) {
        // verilen karakter(lerin) stringin icindeki indexini verir
        // Merhaba kelimesindeki r nin indexini bulmak istersek kelime.IndexOf("r") -> 2 verir
        // Merhaba kelimesindeki ha nin indexini bulmak için kelime.IndexOf("ha") -> 3 verir
        // Merhaba kelimesindeki a nin indexini bulmak için kelime.IndexOf("a") -> 4 verir
        // bulamazsa hata vermiyor yok anlamı olarak -1 verir

        String kelime= "Merhaba Dünya";

        System.out.println("kelime = " + kelime.indexOf("r"));
        System.out.println("kelime = " + kelime.indexOf("ha"));
        System.out.println("kelime = " + kelime.indexOf("a"));
        System.out.println("kelime = " + kelime.indexOf("ny"));
        System.out.println("kelime = " + kelime.indexOf(" "));
        System.out.println("kelime = " + kelime.indexOf("A"));
        System.out.println("kelime = " + kelime.indexOf("a",5)); // 5 den sonrakileri arastir



    }
}

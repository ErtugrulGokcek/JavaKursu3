package Gun07;

public class _09_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll replace gibi calisir farki kriter (Regex)
        // Regex - regular expression / duzenli ifade
        // todo: regex olarak neler yazılabiliyor google dan arastir

        String text = "Merhaba Dunya";

        System.out.println("orjinal hali = " + text);
        System.out.println("a,b,n -> _ = " + text.replaceAll("[abn]","_")); //a,b,n karakterlerini ayrı ayrı bul ve _ ile degistir
        System.out.println("buyuk harfler -> _ = " + text.replaceAll("[A-Z]","_")); //buyuk harfleri _ ile degistir

    }
}

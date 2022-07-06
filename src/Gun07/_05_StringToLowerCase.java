package Gun07;

public class _05_StringToLowerCase {
    public static void main(String[] args) {
        // toLowerCase stringi kucuk harfe cevirir

        String text = "Merhaba Dunya";

        System.out.println("text = " + text.toLowerCase());
        System.out.println("text kucuk veya buyuk harf de olsa me ile baslıyor mu=? = " + text.toLowerCase().startsWith("me"));


    }
}

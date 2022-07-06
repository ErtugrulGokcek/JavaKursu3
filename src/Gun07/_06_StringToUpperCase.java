package Gun07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        // touppercase stringi buyuk harfe cevirir

        String text = "Merhaba Dunya";

        System.out.println("text = " + text.toUpperCase());
        System.out.println("buyuk kucuk harf farketmeden YA ile bitiyor mu = " + text.toUpperCase().endsWith("YA"));


    }
}

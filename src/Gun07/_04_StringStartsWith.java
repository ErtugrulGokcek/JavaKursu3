package Gun07;

public class _04_StringStartsWith {
    public static void main(String[] args) {
        // startswith bir stringin veriler string ile baslayip baslamadiginin sonucunu boolean olarak doner

        String text = "HCL Technologies";

        System.out.println("text = " + text.startsWith("HC"));
        System.out.println("text = " + text.startsWith("Me"));
        System.out.println("text = " + text.startsWith("M"));
        System.out.println("text = " + text.startsWith("h"));
        System.out.println("text = " + text.startsWith("hc"));


    }
}

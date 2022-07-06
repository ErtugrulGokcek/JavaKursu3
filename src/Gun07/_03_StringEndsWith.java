package Gun07;

public class _03_StringEndsWith {
    public static void main(String[] args) {
        // endsWith ... ile bitiyor mu? sonuc boolean olarak doner

        String text = "Merhaba Dünya";

        System.out.println("text = " + text.endsWith("ya"));
        System.out.println("text = " + text.endsWith("a"));
        System.out.println("text = " + text.endsWith("A"));
        System.out.println("text = " + text.endsWith("y"));
        System.out.println("text = " + text.endsWith("ba"));


    }
}

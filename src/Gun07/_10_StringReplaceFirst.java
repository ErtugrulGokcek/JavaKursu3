package Gun07;

public class _10_StringReplaceFirst {
    public static void main(String[] args) {
        // replace first replace ile ayni sadece ilk bulunanı degistirir

        String text = "Merhaba Dunya";

        System.out.println("orjinal hali = " + text);
        System.out.println("butun a lar degistir = " + text.replace("a","_"));
        System.out.println("sadece ilk a yi degistir = " + text.replaceFirst("a","_"));


    }
}

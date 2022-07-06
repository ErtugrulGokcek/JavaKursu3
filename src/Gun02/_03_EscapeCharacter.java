package Gun02;

public class _03_EscapeCharacter {
    public static void main(String[] args) {
        // Escape Character
        // \n -> yeni satır açıyor
        // \t -> tab tuşuna basılmış etkisi yapıyor
        // \b -> Backspace basılmış etkisi yapar
        // \" -> Çift tırnak yazar
        // \\ -> \ işaretini koyar
        // \r -> satır başına kadar olan karakterlerin hepsini siler

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba \n Dünya");
        System.out.println("Merhaba \t Dünya");
        System.out.println("Merhaba\bDünya\b");
        System.out.println("Merhaba\"Dünya");
        System.out.println("Merhaba\\Dünya");
        System.out.println("Merhaba\rDünya");
    }
}


package Gun12;

public class _08_JavaRandom {
    public static void main(String[] args) {
        // 0 ile 6 arasinda random sayi ureten programi yaziniz

        // Math.random() -> 0.0000 - 0.99999 arasi sayi uretir

        double doubleRandomSayi = Math.random();
        System.out.println("doubleRandomSayi = " + doubleRandomSayi);

        int tamSayi = (int)(doubleRandomSayi*6); // 0 ile 5 arasi veriyor
        System.out.println("tamSayi = " + tamSayi);

        System.out.println("tamSayi = " + (int)(Math.random()*6));

    }
}

package Gun10;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        // baklava dilimi = if
        // girilen bir sayinin 10 dan buyuk ise ekrana 10 dan buyuk diye yazdiriniz
        // algoritma
        // 1-Basla
        // 2-Sayi oku
        // 3-Sayi  > 10 ise 10 dan buyuk yaz
        // 4-Dur

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi = oku.nextInt();

        if (sayi > 10)
        {// evet cikisi

            System.out.println("10 dan buyuk");
        }


    }
}

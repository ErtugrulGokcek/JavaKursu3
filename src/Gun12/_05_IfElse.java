package Gun12;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // girilen sayi 50 den buyuk ise 1 degilse 0 degerini ekrana yazdiriniz (ternary)

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz =");
        int sayi = oku.nextInt();

        int sonuc = (sayi>50) ? 1 : 0;
        System.out.println("sonuc = " + sonuc);


    }
}

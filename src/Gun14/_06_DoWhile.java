package Gun14;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        // kullanici 0 degeri girene kadar girdigi sayilarin toplamini bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz =");
        int sayi = oku.nextInt();

        int toplam=0;

        while (sayi != 0) {
            toplam=toplam+sayi;
            System.out.print("sayi giriniz =");
            sayi = oku.nextInt();

        }
        System.out.println("toplam = " + toplam);

        //2.yol
        toplam=0;
        do {
            System.out.print("sayi giriniz =");
            sayi = oku.nextInt();
            toplam = toplam + sayi;
        } while (sayi != 0);

        System.out.println("toplam = " + toplam);


    }
}

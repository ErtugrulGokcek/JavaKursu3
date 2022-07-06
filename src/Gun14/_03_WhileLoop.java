package Gun14;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // girilen 6 sayinin toplamini yazdiriniz

        Scanner oku = new Scanner(System.in);
        int sayac = 1;
        int toplam = 0;
        while (sayac < 7) {
            System.out.print(sayac+".sayiyi giriniz =");
            int sayi = oku.nextInt();
            toplam = toplam + sayi;
            sayac++;
        }
        System.out.println("toplam = " + toplam);

    }
}

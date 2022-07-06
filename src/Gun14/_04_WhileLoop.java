package Gun14;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // girilen bir sayiya kadar olan sayilarin toplamini bularak yazdiriniz girilen sayi dahil

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi giriniz = ");
        int sayi=oku.nextInt();
        int sayac =1;
        int toplam =0;

        while (sayac<=sayi) {
            toplam=toplam+sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }

}

package Gun14;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // girilen bir sayiya kadar olan sayilardan sadece tek olanlarinin toplamini bulunuz
        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz = ");
        int sayi= oku.nextInt();

        int sayac = 0;
        int toplam =0;

        while (sayac<=sayi) {
            if (sayac%2 ==1)
                toplam=toplam+sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);

    }
}

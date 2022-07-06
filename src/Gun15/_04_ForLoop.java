package Gun15;

import java.util.Scanner;

public class _04_ForLoop {
    public static void main(String[] args) {
        // kullanicinin girecegi bir rakama kadar olan sayilarin toplamini bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz = ");
        int sayi = oku.nextInt();

        int i=0;
        int toplam =0;

        for (i=0;i<sayi;i++) {
            toplam = toplam+i;
        }
        System.out.println("toplam = " + toplam);

    }

}

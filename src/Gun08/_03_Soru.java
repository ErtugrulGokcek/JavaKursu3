package Gun08;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // girilen bir cumledeki A harfi sayisini bulunuz (buyuk kucuk farki olmaksizin)

        Scanner oku = new Scanner(System.in);
        System.out.print("Cumleyi Giriniz =");
        String cumle = oku.nextLine();

        String kucukHali = cumle.toLowerCase();

        int uzunluk1 = kucukHali.length();

        String cumle2 = kucukHali.replace("a","");

        int uzunluk2 = cumle2.length();

        System.out.println("Cumledeki 'a' sayisi = " + (uzunluk1-uzunluk2));





    }
}

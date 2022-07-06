package Gun07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // girilen bir ad soyadın adını ve soyadını ayırıp ayrı ayrı yazdırınız

        Scanner oku = new Scanner(System.in);

        System.out.print("AdSoyadGiriniz=");

        String isim = oku.nextLine();

        int bosluk = isim.indexOf(" ");

        String ad = isim.substring(0, bosluk);

        String soyad = isim.substring(bosluk+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);


    }
}

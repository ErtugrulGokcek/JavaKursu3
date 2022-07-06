package Gun08;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        // Ayri ayri girilen ad ve soyadi aralarinda bir bosluk birakarak birlestiriniz

        Scanner oku = new Scanner(System.in);

        System.out.print("Adınızı Giriniz=");

        String ad = oku.nextLine();

        System.out.print("Soyadınızı Giriniz=");

        String soyad = oku.nextLine();

        System.out.println("Ad Soyad = " + ad.concat(" ").concat(soyad));



    }
}

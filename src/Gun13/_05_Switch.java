package Gun13;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // girilen 2 tamsayiyi kullanicidan aldiktan sonra
        //Toplama icin T Cıkarma icin C carpma icin P bolme icin B
        // harfleri alarak istege uygun olan islemi yaptirip
        // sonucu yazdiriniz (switch)

        Scanner oku = new Scanner(System.in);
        System.out.print("Birinci tamsayiyi girin = ");
        int sayi1 = oku.nextInt();
        System.out.print("Ikinci tamsayiyi girin = ");
        int sayi2 = oku.nextInt();
        Scanner oku2 = new Scanner(System.in);
        System.out.print("Islemi girin = ");
        String islem = oku2.nextLine();

        switch (islem.toUpperCase()) {
            case "T":
                System.out.println("Toplam = " + (sayi1+sayi2));break;
            case "C":
                System.out.println("Fark = " + (sayi1-sayi2));break;
            case "P":
                System.out.println("Carpim = " + (sayi1*sayi2));break;
            case "B":
                System.out.println("Bolum = " + (sayi1/sayi2));break;
            default:
                System.out.println("Hatali islem girdiniz");



        }




    }
}

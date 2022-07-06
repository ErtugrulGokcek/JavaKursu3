package Gun13;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        //girilen 2 tamsayiyi kullanicidan aldiktan sonra toplama icin T
        // cıkarma icin C carpma icin P bolme icin B harflerini alrak islemi yaptirip sonucu yazdir

        Scanner oku = new Scanner(System.in);
        System.out.print("Ilk tamsayiyi girin =");
        int sayi1 = oku.nextInt();
        System.out.print("Ikinci tamsayiyi girin =");
        int sayi2 = oku.nextInt();
        Scanner oku2 = new Scanner(System.in);
        System.out.print("islemi girin (TCPB) =");
        String islem = oku2.nextLine();

        if (islem.equals("T")) {
            System.out.println("Sonuc = " + (sayi1+sayi2));
        } else if (islem.equals("C")) {
            System.out.println("Sonuc = " + (sayi1-sayi2));
        } else if (islem.equals("P")) {
            System.out.println("Sonuc = " + (sayi1*sayi2));
        }else {
            System.out.println("Sonuc = " +(sayi1/sayi2));
        }


    }
}

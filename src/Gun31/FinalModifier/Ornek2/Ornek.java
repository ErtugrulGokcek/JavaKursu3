package Gun31.FinalModifier.Ornek2;

import java.util.Scanner;

public class Ornek {
    // Sabitler isimli bir class da sabit bir sekilde
    // bir gundeki saat sayisi, bir saatdaki dakika sayisi ve bir dakikadaki saniye sayisini tanimlayiniz
    //mainde kullanicidan gun saat ve dakikayi alarak toplam saniyeyi bulunuz
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("gun sayisini giriniz: ");
        int g = oku.nextInt();

        System.out.print("saat sayisini giriniz: ");
        int s = oku.nextInt();

        System.out.print("dakika sayisini giriniz: ");
        int d = oku.nextInt();

        int toplamSaniye = (g*Sabitler.saat*Sabitler.dakika*Sabitler.saniye)+(s*Sabitler.dakika*Sabitler.saniye)+(d*Sabitler.saniye);

        System.out.println("toplamSaniye = " + toplamSaniye);


    }

}

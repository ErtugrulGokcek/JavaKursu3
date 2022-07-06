package Gun33._03_Encapsulation;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Okul okul = new Okul("Kabatas ilkokulu",3);

        Scanner oku = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        do {
            System.out.print("Ogrenci Adi: ");
            String ad = oku.nextLine();

            System.out.print("Ogrenci Soyadi: ");
            String soyad = oku.nextLine();

            System.out.print("Ogrenci Yasi: ");
            int yas = okuInt.nextInt();

            if (yas<=15){

                Ogrenci ogr = new Ogrenci(ad,soyad,yas);
                okul.ogrenci.add(ogr);

            }else
                System.out.println("Yas sebebiyle kayit alinamadi!");

            System.out.println("okul = " + okul.ogrenci);
        }while (okul.ogrenci.size() < okul.getMaxOgrenciSayisi());

    }
}

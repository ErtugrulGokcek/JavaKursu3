package Gun26._02_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // bir okulda kayit program icin ogrenci bilgileri alan modul yazilacaktir
        // ogrenciye ait bilgileri ( adi, soyadi, sinifi ve adresi) vardir
        // kullanicidan 3 adet ogrenci bilgileri alarak doldurunuz
        // da sonra bunlarin bilgilerini yazdiriniz

        ArrayList<Ogrenci> snf = new ArrayList<>();
        Scanner oku = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.print("Ogrencinin adi: ");
            ogr.ad=oku.nextLine();

            System.out.print("Ogrencinin soyadi: ");
            ogr.soyad= oku.nextLine();

            System.out.print("Ogrencinin sinifi: ");
            ogr.sinif= oku.nextLine();

            System.out.print("Ogrencinin adresi: ");
            ogr.adres= oku.nextLine();

            snf.add(ogr);
        }
        for (Ogrenci ogr:snf){
            System.out.println("ogr.ad = " + ogr.ad);
            System.out.println("ogr.soyad = " + ogr.soyad);
            System.out.println("ogr.sinif = " + ogr.sinif);
            System.out.println("ogr.adres = " + ogr.adres);
        }
    }
}
class Ogrenci {
        String ad;
        String soyad;
        String sinif;
        String adres;
}
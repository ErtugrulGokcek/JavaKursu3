package Gun26._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
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

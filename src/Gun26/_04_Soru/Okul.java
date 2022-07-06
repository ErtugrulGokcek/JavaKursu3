package Gun26._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // ogretmen icin bir not defteri programi yapilmak isteniyor
        // her ogrencinin okul no int tam adi string ve notu int vardir
        // ogretmenden 3 ogrenci icin bu bilgileri aliniz
        // butun sinifi bir methodda yazdiriniz
        // sinifin ortalamasini yine bir methodda yazdiriniz

        ArrayList<Ogrenci> snf = new ArrayList<>();
        Scanner okuStr = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.print("Ogrencinin adi: ");
            ogr.tamAd=okuStr.nextLine();


            System.out.print("Ogrencinin nosu: ");
            ogr.okulNo= okuInt.nextInt();

            System.out.print("Ogrencinin notu: ");
            ogr.notu= okuInt.nextInt();

            snf.add(ogr);

        }
        bilgiYazdir(snf);
        ortalamaYaz(snf);

    }
    public static void bilgiYazdir(ArrayList<Ogrenci>snf){
        for(Ogrenci ogr: snf){
            System.out.println(ogr.okulNo + " "+ ogr.tamAd +" "+ ogr.notu);
        }
    }
    public static void ortalamaYaz (ArrayList<Ogrenci> snf){
        int toplam=0;
        for (Ogrenci ogr: snf) {
            toplam=toplam+ogr.notu;
        }
        System.out.println("ortalama = " + (toplam/snf.size()));
    }
}

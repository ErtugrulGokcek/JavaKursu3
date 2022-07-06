package Gun23;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_Java2DArrayList {
    public static void main(String[] args) {
        /****************/

        int sayi=5; // tek bir rakam saklayabilen degisken
        int [] dizi = new int [20]; // 20 adetsayi saklayabilen degisken
        int [][] tablo = new int[20][4]; // 20x4 tane sayi saklayabilen bir degisken

        ArrayList<Integer> liste = new ArrayList<>(); // istenildigi kadar lakam eklenebilen degisken
        /****************/

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>(); // listelerin listesi
        // bunun her bir elemani array list

        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(60);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> fizNotlar = new ArrayList<>();
        fizNotlar.add(65);
        fizNotlar.add(85);
        fizNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        kimNotlar.add(85);
        kimNotlar.add(95);
        kimNotlar.add(55);

        notlarListesi.add(matNotlar);
        notlarListesi.add(fizNotlar);
        notlarListesi.add(kimNotlar);

        notlarListesi.get(0); //her bir elemani bir liste
        notlarListesi.get(0).get(0); // 0. listenin 0. indexini verir

        System.out.println("notlarListesi = " + notlarListesi.get(0)); // 0. listeyi yazdirir
        System.out.println("notlarListesi = " + notlarListesi.get(1)); // 1. listeyi yazdirir
        System.out.println("notlarListesi = " + notlarListesi.get(2)); // 2. listeyi yazdirir

        for (int i=0;i<notlarListesi.size();i++)
            System.out.println("notlarListesi = " + notlarListesi.get(i));

        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        // tum notlar tek tek nasil yazdirilir

        for (int i=0;i<notlarListesi.size();i++){ // liste uzunlugu

            System.out.println(dersler.get(i)); // ders isimlerini yazdik
            for (int j=0;j<notlarListesi.get(i).size();j++) { // her bir listedeki notlarin miktari
                System.out.print((i + 1) + ".yaprak, " + (j + 1) + ".not= ");
                System.out.println(notlarListesi.get(i).get(j));

            }
        }
        // Soru1: kullanicidan alinan ders nosuna gore ekrana notlarin listesini bir fonksiyonda yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.print("DersNo (0-Mat, 1-Fiz, 2-Kim) : ");
        int dersNo= oku.nextInt();

        dersNotlariYazdir(notlarListesi, dersNo ,dersler);
        int ort =ortalamaBul(notlarListesi,dersNo);
        System.out.println("ort = " + ort);

        //2. soru: yukarida girilen derse ait ortalamayi mainde yazdirin

    }
    public static void dersNotlariYazdir (ArrayList<ArrayList<Integer>>notlarListesi, int dersNo, ArrayList<String>dersler){

        System.out.println(dersler.get(dersNo)); // dersin adi yazildi

        for (int i=0;i<notlarListesi.get(dersNo).size();i++)
            System.out.println(notlarListesi.get(dersNo).get(i));


    }
    //fonksiyona not listesi ve ders no girecek ort donecek
    public static int ortalamaBul (ArrayList<ArrayList<Integer>>notlarListesi,int dersNo){
        int toplam=0;
        for (int i=0;i<notlarListesi.get(dersNo).size();i++)
            toplam=toplam+notlarListesi.get(dersNo).get(i);

        return toplam/notlarListesi.get(dersNo).size();
    }
}

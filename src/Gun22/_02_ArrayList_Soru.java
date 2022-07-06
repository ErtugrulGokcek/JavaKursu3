package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        // bir ogretmenden girmek istedigi kadar notu alınız
        // ve ortalamayi gecen ogrenci sayisini bulunuz
        //ogretmene devam etmek istiyor musunuz (E/H) seklinde sorunuz

        Scanner oku = new Scanner(System.in);
        Scanner oku2 = new Scanner(System.in);

        ArrayList <Integer> notlar = new ArrayList<>();

        int toplam = 0;
        String devamMi = "";
        do {
            System.out.print("not giriniz = ");
            int not = oku.nextInt();
            notlar.add(not);
            toplam+=not;

            System.out.print("Devam Etmek istiyor musunuz (E/H) ");
            devamMi= oku2.next();
        }while (devamMi.equalsIgnoreCase("E"));

        int ort=toplam/notlar.size();

        gecenSayisiYaz(notlar,ort);
        
    }
    public static void gecenSayisiYaz(ArrayList<Integer>diziList, int ort){
        int gecenSayisi=0;
        for (int i=0; i<diziList.size();i++){
            if (diziList.get(i)>=ort)
                gecenSayisi++;
        }
        System.out.println("gecenSayisi = " + gecenSayisi);

    }
}

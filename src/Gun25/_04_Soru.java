package Gun25;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_Soru {
    public static void main(String[] args) {
        // canli sozluk yapilmak isteniyor, kullaniciya ait bir menu cıkariniz
        // 1- ekleme (bu secenekte kelimenin kendisi ve manasini bir cumle ile yaziniz)
        // 2- duzeltme ( bu secenekte kelimenin manasini duzelttiriniz)
        // 3- listeleme
        // 4- arama (bu secenekte verilen bir kelimeyle baslayan tum kelimelerin manaları)
        // 5- silme
        // 6- cikis

        Map<String,String> sozluk =new TreeMap<>();

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        String kelime ="";
        String anlam ="";
        int secim =0;

        do {
            System.out.print("*********Menu*********");
            System.out.println("1- Ekleme");
            System.out.println("2- Duzeltme");
            System.out.println("3- Listeleme");
            System.out.println("4- Arama");
            System.out.println("5- Silme");
            System.out.println("6- Cikis");

            secim = okuInt.nextInt();

            switch (secim){
                case 1 : // ekleme islemleri
                    System.out.print("Kelimeyi giriniz: ");
                    kelime = okuStr.nextLine();
                    System.out.print("Anlamini giriniz: ");
                    anlam = okuStr.nextLine();

                    sozluk.put(kelime,anlam);

                    break;
                case 2 : // duzeltme islemleri
                    // todo: kelime var mi kontrol
                    System.out.print("Duzeltilecek kelimeyi giriniz: ");
                    kelime = okuStr.nextLine();
                    System.out.print("Duzeltilecek anlami giriniz: ");
                    anlam = okuStr.nextLine();

                    break;
                case 3 : // listeleme islemleri
                    System.out.println("sozluk = " + sozluk);
                    break;
                case 4 : // arama islemleri
                    break;
                case 5 : // silme islemleri
                    break;

            }



        }while(secim<6);

    }
 }

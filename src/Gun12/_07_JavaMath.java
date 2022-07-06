package Gun12;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        // math max yontemi ile girilen 3 sayidan buyuk olanini bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz =");
        int sayi1 = oku.nextInt();
        System.out.print("ikinci sayiyi giriniz =");
        int sayi2 = oku.nextInt();
        System.out.print("ucuncu sayiyi giriniz =");
        int sayi3 = oku.nextInt();

        if (Math.max(sayi1,sayi2)<sayi3)
            System.out.println("sonuc =" + sayi3);
        else
            System.out.println("sonuc = " + Math.max(sayi1,sayi2));

        // farkli yontem

        int enb = Math.max(sayi1,sayi2);
        enb = Math.max(enb, sayi3);
        System.out.println("enb = " + enb);

        // farkli yontem

        int enb2 = Math.max(sayi1, Math.max(sayi2,sayi3));
        System.out.println("enb2 = " + enb2);

        // farkli yontem

        System.out.println("enb3 = " + Math.max(sayi1, Math.max(sayi2,sayi3)));





        }


    }



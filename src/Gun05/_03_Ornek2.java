package Gun05;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {
        // kullanicidan adini ve soyadini girmesini isteyiniz

        Scanner oku=new Scanner(System.in);

        System.out.print("Adinizi Soyadinizi Giriniz=");

        String AdSoyad=oku.nextLine();

        System.out.println("AdSoyad = " + AdSoyad);
    }
}

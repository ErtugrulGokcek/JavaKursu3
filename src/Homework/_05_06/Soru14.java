package Homework._05_06;

import java.util.Scanner;

public class Soru14 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz=");
        int vize = oku.nextInt();

        System.out.print("Final notunuzu giriniz=");
        int _final = oku.nextInt();

        System.out.println("ort. = " + ((vize*0.4)+(_final*0.6)));
    }
}

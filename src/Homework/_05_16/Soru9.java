package Homework._05_16;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cumle giriniz = ");
        String cumle = oku.nextLine();

        int i=0;
        int sonBosluk = cumle.lastIndexOf(" ");

        do {
            int j = cumle.indexOf(" ",i);
            int bosluk = cumle.indexOf(" ",j);
            System.out.println("Bas harfler = "+ cumle.charAt(bosluk+1));
            i=bosluk+1;
        }while (i<=sonBosluk);

    }
}

package Homework._05_16;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        int i=0;
        int enb = Integer.MAX_VALUE;

        do {
            System.out.print("bir sayi giriniz = ");
            int sayi = oku.nextInt();
            int sayi1 = Math.abs(sayi);
            i++;
            if(enb < sayi1){
                break;
            }else
                enb=sayi1;

        }while (i<10);

    }
}

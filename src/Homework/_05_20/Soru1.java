package Homework._05_20;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        int [] array =new int[4];
        int enb=0;
        int enk=Integer.MAX_VALUE;
        Scanner oku = new Scanner(System.in);

        for (int i=0;i< array.length;i++) {
            System.out.print((i + 1) + ".sayiyi giriniz = ");
            array [i] = oku.nextInt();
        }
            for (int i=0;i< array.length;i++) {
                if (array[i] > enb)
                    enb = array[i];
            }
        for (int i=0;i< array.length;i++) {
            if (array[i] < enk)
                enk = array[i];
        }
        System.out.println("fark = " + (enb-enk) );
        }

    }


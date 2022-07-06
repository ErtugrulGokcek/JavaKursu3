package Homework._05_24;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

        System.out.println("toplam = " +getSum());
    }
    public static int getSum (){
        Scanner oku = new Scanner(System.in);
        System.out.print("tutarlari giriniz = ");
        String tutarlar = oku.nextLine();

        int toplam =0;
        tutarlar=tutarlar.replaceAll("\\$","");
        String [] rakamlar = tutarlar.split(" ");
        ArrayList<Integer> rakam = new ArrayList<>();
        for (int i=0; i< rakamlar.length;i++){
            rakam.add(Integer.parseInt(rakamlar[i]));
            toplam=toplam+rakam.get(i);
            if (toplam>=0)
                toplam=toplam;
            else
                toplam=-1;
                  }

        return toplam;
    }
}

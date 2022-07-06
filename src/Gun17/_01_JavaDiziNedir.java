package Gun17;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {

        int sayi; // 1 tane sayi saklayabilir

        int [] notlar = new int[250]; //250 tane sayi saklayabilir

        Scanner oku = new Scanner(System.in);
        for (int i =0;i<250;i++){
            System.out.print("lutfen notu giriniz = ");
            notlar[i] = oku.nextInt();
        }


    }


}

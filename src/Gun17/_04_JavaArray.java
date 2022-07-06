package Gun17;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 5 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

        int dizi[] = new int[5];
        int toplam = 0;
        int j = 0;
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("bir sayi giriniz = ");
            dizi[i] = oku.nextInt();
            toplam = toplam + dizi[i];

        }
            double ortalama = toplam / dizi.length;
        for(int i=0; i< dizi.length;i++) {
            if (dizi[i]>ortalama)
            j++;
        }

        System.out.println("ortalamadan buyuk sayi adedi = " + j);
    }
}

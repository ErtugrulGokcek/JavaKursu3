package Gun21;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        // Kullanicinin girecegi 2 sayidan buyuk olanini bulma islemini bir methodda
        // yaptiktan sonra mainde yazdiriniz

        int s1 = sayiOku();
        int s2 = sayiOku();
        int enb = enbYaz(s1, s2);

    }

    public static int enbYaz(int s1, int s2) {
        if (s2 > s1)
            return s2;
        else
            return s1;
    }

    public static int sayiOku() {
        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println(i + 1 + ".sayiyi giriniz");
            int s1 = oku.nextInt();
            int s2 = oku.nextInt();
        }
    return (sayiOku());
    }
}




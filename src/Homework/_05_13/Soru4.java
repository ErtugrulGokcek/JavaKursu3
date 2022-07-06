package Homework._05_13;

public class Soru4 {
    public static void main(String[] args) {

        int sayac=1;

        while (sayac<=100) {
            if (sayac%4==0 && sayac%5==0)
            System.out.println("sayac = " + sayac);
            sayac++;
        }

    }
}

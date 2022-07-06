package Gun26;

import java.util.Scanner;

public class _01_JavaClassAndObject {

    // methodun yazilabildigi yer

    public static void main(String[] args) {
        // ana programin basladigi ve calistigi yer
        int sayi = 5;
        Scanner oku = new Scanner(System.in);

       Araba benimArabam=new Araba(); // araba tür benim arabam object
        benimArabam.renk = "Kirmizi";
        benimArabam.motorHacmi = 1600;
        benimArabam.yil = 2020;

        System.out.println("benimArabam.renk = " + benimArabam.renk);

    }
    // methodun yazilabildigi yer
}

class Araba { // bu bolume class denir ve bu sekilde tanimlanir

    String renk;
    int yil;
    double motorHacmi;

}
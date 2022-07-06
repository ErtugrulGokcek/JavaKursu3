package Homework._05_13;

public class Soru2 {
    public static void main(String[] args) {

        int sayac1=1;
        int sayac2=2;
        int tekToplam=0;
        int ciftToplam=0;
        int limit=100;

        while (sayac1<limit && sayac2<=limit) {
            tekToplam=tekToplam+sayac1;
            ciftToplam=ciftToplam+sayac2;

            sayac1=sayac1+2;
            sayac2=sayac2+2;

        }
        System.out.println("tekToplam = " + tekToplam);
        System.out.println("ciftToplam = " + ciftToplam);
    }
}

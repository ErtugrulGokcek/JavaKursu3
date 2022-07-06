package Homework._05_13;

public class deneme {
    public static void main(String[] args) {

        //else if
        //      (girdi.contains(sayi1))
        //        yanlis=yanlis-1+dogru;
        //   sayac2++;
        int yanlis =0;
        int dogru = 0;
        int sayac = 0;
        int sayac2 = 0;
        int sayi = 1234;
        int girdi = 2156;
        String sayi2 = Integer.toString(sayi);
        String girdi2 = Integer.toString(girdi);
        do {
            if (girdi2.charAt(sayac) == sayi2.charAt(sayac)) {
                dogru++;
                sayac++;
            } else {
                boolean check =((girdi2.contains("(sayi2.charAt(sayac2))")));
                yanlis--;
                sayac2++;
            }

             {

            }


        } while (sayac < 4 && sayac2 < 4);
        System.out.println("dogru = " + dogru);
        System.out.println("yanlis = " + (yanlis+dogru));
        System.out.println("sayac = " + sayac);
        System.out.println("sayac2 = " + sayac2);

    }






    }


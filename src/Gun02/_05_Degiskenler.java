package Gun02;

public class _05_Degiskenler {
    public static void main(String[] args) {
        //Degiskenler

        int sayi;    //int -> integer int miktarında alan kaplayan tam sayı tipi

        sayi=5;  //sayının değeri 5
        System.out.print("sayi="); // kelime olarak sayı
        System.out.println(sayi); // bu durumda değişkenin durumunu yazar
        System.out.println("sayi="+sayi);

        sayi=7;      //sayının değeri 7
        int kisakenar=5;
        int uzunkenar=7;
        int cevre=5+5+7+7;

        System.out.println("cevresi="+cevre);

        kisakenar=sayi; //sayının değeri kisakenara atandı kisakenar=7
        cevre = (kisakenar+uzunkenar)*2;
        System.out.println("cevre = " + cevre);


    }
}

package Gun04;

public class _01_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> char -> int -> long -> float -> double ; otomatik donusum.

        int sayi=9;
        long toplam=678;
        double oran=3.2;
        
        oran=sayi; // oranin degeri 9 oldu, kayıp olmadı.
        // bu tip donusume genisletilme yonunde oldugundan buna widening casting denir. Diger adıyla herhangi ek bir islem yapılmadıgından otomatik donusum denir.

        System.out.println("oran = " + oran);

        toplam=sayi;
        System.out.println("toplam = " + toplam);


    }
}

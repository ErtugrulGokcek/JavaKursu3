package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        int sayi=5;

        String ad="Ertugrul"; // String ifadelerin sayı gibi bir siniri olmadigindan ""tirnak ile siniri belli edilir.
        String soyad="Gokcek";

        System.out.println("ad"); // ad
        System.out.println(ad); // Ertugrul

        System.out.println("ad"+"soyad"); // adsoyad
        System.out.println(ad+soyad); // ErtugrulGokcek

        System.out.println(ad+" "+soyad); // Ertugrul Gokcek

        String TamIsim= ad+soyad; // ErtugrulGokcek
        String TamIsim2= ad+" "+soyad; // Ertugrul Gokcek

        System.out.println("TamIsim =" + TamIsim);
        System.out.println("TamIsim2 =" + TamIsim2);
        
        int yas=36;
        int kilo=80;
        
        String bilgi= ad+soyad+yas+kilo;
        System.out.println("bilgi = " + bilgi);

        System.out.println(ad+" "+soyad+" "+yas+" "+kilo);
        


    }
}

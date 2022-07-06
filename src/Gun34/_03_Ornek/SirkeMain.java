package Gun34._03_Ornek;

public class SirkeMain {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Ahmet",3000,1.25);
        GenelMudur g1 = new GenelMudur("Ayse",5000,1.5,2000);

        System.out.println("c1 = " + c1);
        System.out.println("c1 = " + c1.maasHesapla());

        System.out.println("g1 = " + g1);
        System.out.println("g1.maasHesapla() = " + g1.maasHesapla());
    }
}

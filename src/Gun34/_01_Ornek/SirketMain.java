package Gun34._01_Ornek;

public class SirketMain {
    public static void main(String[] args) {
        Yonetici yon1 = new Yonetici();
        yon1.maas = 3000;
        yon1.departman ="Destek Birimi";

        yon1.bordroYazdir();
        yon1.zamYap();


    }
}

package Gun30.PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan c1 = new Calisan();

        c1.id = 1;
        c1.name = "halil";
        c1.surname = "findik";
        //c1.password = "1234";
        // burasi private oldugundan direk erisilemez

        c1.sifreAta("Merhaba123+");
        c1.sifreGoster();

    }
}

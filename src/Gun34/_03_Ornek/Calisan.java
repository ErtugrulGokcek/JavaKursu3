package Gun34._03_Ornek;

public class Calisan {
    String isim;
    double maas;
    double maasKatSayisi;

    public Calisan(String isim, double maas, double maasKatSayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatSayisi = maasKatSayisi;
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatSayisi=" + maasKatSayisi +
                '}';
    }

    public double maasHesapla (){

        return maas*maasKatSayisi;
    }

}

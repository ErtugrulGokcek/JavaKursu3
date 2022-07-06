package Gun31.StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAdi = "Yildirim Ortaokulu"; //hepsi icin gecerli tek bir eleman
    // tekrarlayan ve tum nesneler icin kullanilacak degiskenler icin STATIC kullaniyoruz

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAdi='" + okulAdi + '\'' +
                '}';
    }
}

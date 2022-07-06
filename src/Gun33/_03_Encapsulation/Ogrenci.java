package Gun33._03_Encapsulation;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int yas;
    private int ID;
    private static int IDSayac=0;

    public Ogrenci(String ad, String soyad, int yas) {
        this.setAd(ad);
        this.setSoyad(soyad);
        this.setYas(yas);
        ID = ++IDSayac;

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<15)
        this.yas = yas;
        else
            System.out.println("baska ogrenci giriniz!");
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", ID=" + ID +
                '}';
    }
}

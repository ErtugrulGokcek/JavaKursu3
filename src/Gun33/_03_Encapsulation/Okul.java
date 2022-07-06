package Gun33._03_Encapsulation;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private int maxOgrenciSayisi;

    ArrayList<Ogrenci> ogrenci = new ArrayList<>();

    public Okul(String okulAd, int maxOgrenciSayisi) {
        this.setOkulAd(okulAd);
        this.setMaxOgrenciSayisi(maxOgrenciSayisi);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }
}

package Gun31.FinalModifier.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo; // degistirilemez sadece 1 kez veri atama sansi var

    static int tcNoSayac=1001;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = ++tcNoSayac;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}

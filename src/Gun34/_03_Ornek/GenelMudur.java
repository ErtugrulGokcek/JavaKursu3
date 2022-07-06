package Gun34._03_Ornek;

public class GenelMudur extends Calisan{
    int tazminat;

    public GenelMudur(String isim, double maas, double maasKatSayisi,int tazminat) {
        super(isim, maas, maasKatSayisi);
        this.tazminat=tazminat;
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+tazminat;
    }
}

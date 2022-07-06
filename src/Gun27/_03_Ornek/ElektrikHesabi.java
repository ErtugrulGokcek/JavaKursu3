package Gun27._03_Ornek;

public class ElektrikHesabi {

    int toplamTuketim;
    double oran = 0.7;
    double odenecekTutar;
    int ay;

    public void odenecekTutar(){

        System.out.println("fatura = " + (toplamTuketim*oran) + " try");
    }
    public void tuketimEkle (int tuketim){

        toplamTuketim+=tuketim;
    }
    public void toplamTuketimYaz (){
        System.out.println("toplamTuketim = " + toplamTuketim);
    }

}

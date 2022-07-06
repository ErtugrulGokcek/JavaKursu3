package Gun26._05_Soru;

public class Campus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)
        // Ogrenci : okulNo, tamAd, okul

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.
        Ogrenci ogr = new Ogrenci();

        System.out.println(ogr.okulNo + " "+ ogr.tamAd + " " +ogr.okulu.okulAdi+ " " +ogr.okulu.mudurAdi+ " " +ogr.okulu.maasi);
    }
}

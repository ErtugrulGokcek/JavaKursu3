package Gun27._03_Ornek;

public class Ornek {
    public static void main(String[] args) {
        //1.Adım  :ayrı dosyada olmak üzere Musteri isimli (fields: name) isimli bir class tanımlayınız.
        //2.Adım  :ayrı bir dosyada ElektrikHesabi isimli (fields : toplamTuketim, oran(double), OdenecekTutar)
        //3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        //4.Adım  :1 tane müşteri oluşturunuz, Hesabı u dahil;
        //5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
        //         tuketimEkle olasun her verilen aylık rakamı toplayarak biriktirsin.
        //6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız yazdırınız.

        //ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
        //        ondan sonra toplam alarak çıkartınız

        Musteri a = new Musteri();

        a.name = "Ertugrul";

        ElektrikHesabi hesap = new ElektrikHesabi();
        a.elektrikHesabi = hesap;

        a.elektrikHesabi.tuketimEkle(100);
        a.elektrikHesabi.tuketimEkle(200);
        a.elektrikHesabi.tuketimEkle(500);

        a.elektrikHesabi.toplamTuketimYaz ();

        a.elektrikHesabi.odenecekTutar();

    }
}

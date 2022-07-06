package Gun30.Soru1;

public class Banka {
    // Musteri (hesapID, ad, soyad, MusteriHesap (Hesap tipinde))
    // Hesap (bakiye (direk erisim olmamali), yatan, cekilen)
    // bir banka uygulamasi icin 1 musteri tanimlayiniz, musteri hesabina sirasiyla 100 tl ve 200 tk yatiriniz
    // sonrasinda 50 tl cekiniz. musterinin kalan bakiyesini yazdiriniz
    // bakiyeye direk para atanamadigini kontrol ediniz

    public static void main(String[] args) {

        Musteri m1 =new Musteri();

        m1.hesapID = 1234;
        m1.ad ="ali";
        m1.soyad = "veli";
        m1.musteriHesap = new Hesap();

        m1.musteriHesap.paraYatir(100);
        m1.musteriHesap.paraYatir(200);
        m1.musteriHesap.paraCek(50);

        m1.musteriHesap.bakiyeGoster();




    }


}

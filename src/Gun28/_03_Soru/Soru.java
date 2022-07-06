package Gun28._03_Soru;

public class Soru {
    public static void main(String[] args) {

//        Bir universitede ogrencilere ders kaydi yapilacaktir
//                1- Ders Class : adi :Lesson, fields: name, credit (1-10 arasinda deger)
//                2- Ogrenci class: adı : Student, fields : name, maxCredit, dersleri listesini tutacak bir liste
//                3- 3 adet ders olustur
//                4- 1 adet ogrenci tanimlayiniz alabilecegi maxCredit 10 olsun
//                5- bu ogrencinin ders listesine acilmis dersleri ekleyin, ders eklerken maz alabilecegi credit i gecmemeli
//                gecerse uyari versin, alabileceginiz max credit doldu seklinde


        Lesson ders1 = new Lesson();
        ders1.name="Mat101";
        ders1.credit=4;

        Lesson ders2 = new Lesson();
        ders2.name="Java101";
        ders2.credit=3;

        Lesson ders3 = new Lesson();
        ders3.name="Alg101";
        ders3.credit=6;

        Student ogr1 = new Student();
        ogr1.name = "Vasif";
        ogr1.maxCredit = 10 ;

        // bu dersleri sirasiyla ekleyecegiz alabilecegi toplam krediyi gecene kadar

        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);


    }
}

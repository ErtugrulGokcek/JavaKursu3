package Gun27._01_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1. adim : person isimli bir class tanimlayiniz: name, surname, age,
        // 2- adim : mainde 2 tane bu siniftan nesne olusturup deger atayiniz
        // 3- adim : bu degerleri yazdiriniz
        // 4- adim : getBirthYear isminde person a ait bir method yaziniz calistiginda kisinin dogum yilini versin
        // 5- Adım : getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D
        Person kisi1 = new Person();
        kisi1.name = "Hatice";
        kisi1.surname = "Namli";
        kisi1.age = 20;

        Person kisi2 = new Person();
        kisi2.name = "Vasif";
        kisi2.surname = "Zeynelov";
        kisi2.age = 25;

        // 1. yontem
        System.out.println("kisi1 = " + kisi1.name);
        System.out.println("kisi1 = " + kisi1.surname);
        System.out.println("kisi1 = " + kisi1.age);

        System.out.println("kisi2 = " + kisi2.name);
        System.out.println("kisi2 = " + kisi2.surname);
        System.out.println("kisi2 = " + kisi2.age);

        System.out.println();
        //2. yontem

        BilgiYazdir (kisi1);
        BilgiYazdir (kisi2);

        System.out.println();
        // 3.yontem

        kisi1.BilgiYazdir();
        kisi2.BilgiYazdir();

        System.out.println();
        kisi1.getBithyear();
        kisi2.getBithyear();

        System.out.println();
        kisi1.getInıtials();
        kisi2.getInıtials();


    }
    public static void BilgiYazdir(Person kisi){
        System.out.println("kisi = " + kisi.name);
        System.out.println("kisi = " + kisi.surname);
        System.out.println("kisi = " + kisi.age);
    }

}

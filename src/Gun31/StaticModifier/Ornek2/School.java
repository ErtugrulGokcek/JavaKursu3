package Gun31.StaticModifier.Ornek2;

public class School {
    // Student (id, name, surname)
    // yukaridaki gibi 5 ogrenci tanimlayiniz
    // her ogrencinin takip eden bir numarasi olmali
    // ve en son kac ogrenci oldugunu bulabilmeliyim

    public static void main(String[] args) {

        Student s1 = new Student("a","b");
        Student s2 = new Student("c","d");
        Student s3 = new Student("e","f");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println("student count " + Student.i);

    }

    // TODO: 24.06.2022 :Kullaniciya bir menu ile ogrenci ekleme silme arama duzeltme imkani veriniz 
    // TODO: 24.06.2022 :ogrenci silinse bile en son ogrenci sayisi dogru gozukmeli
}

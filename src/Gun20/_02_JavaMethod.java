package Gun20;

public class _02_JavaMethod {
    //buraya
    public static void main(String[] args) { // ana kisim buradan basliyor

        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");

        Math.max(4,5);

        merhabaYaz(); // fonksiyonu cagirma sekli
        merhabaYaz();
        merhabaYaz();
    }// ana kisim burada bitiyor
    // ya da buraya

    public static void merhabaYaz(){ // fonksiyon, method denilebilir
        System.out.println("fonksiyonda Merhaba Dunya");

    }
    // methodlar tekrarlayan kodlardan kurtulup bir kere yazip sonra tekrarcagirmak için
    // ve buyuk programi parcalara bolup kod karisikliginin onune gecmek icin kullanilir
    // temiz bir kod icin
}

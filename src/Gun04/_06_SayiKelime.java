package Gun04;

public class _06_SayiKelime {
    public static void main(String[] args) {
        String GirilenKelime="65"; // bu haliyle Ahmet kelimesinden farksiz toplama yapilamaz

        System.out.println("GirilenKelime = " + GirilenKelime);

        // Kelimenin -> sayiya çevrilmesi

        int GirilenKelimeninSayiHali= Integer.parseInt(GirilenKelime);
        double DoubleHali=Double.parseDouble(GirilenKelime);

        int sayi=GirilenKelimeninSayiHali;
        int toplam=GirilenKelimeninSayiHali+(int)DoubleHali;

        System.out.println("GirilenKelimeninSayiHali = " + GirilenKelimeninSayiHali);
        System.out.println("DoubleHali = " + DoubleHali);
        System.out.println("sayi = " + sayi);
        System.out.println("toplam = " + toplam);

        // Hava sicakligini rakam olarak tanimlayınız ve bir cumle seklinde "Bugun hava 12 derece" yazdiriniz

        int Sicaklik=12;
        System.out.println("Bugun hava "+Sicaklik+" derece"); // otomatik hali
        System.out.println("Bugun hava "+Integer.toString(Sicaklik)+" derece"); // donusturuldu




    }
}

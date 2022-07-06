package Gun33._02_Encapsulation;

public class ArabaMain {
    public static void main(String[] args) {

        Araba araba1 = new Araba();
        araba1.setRenk("Kirmizi");
        araba1.setModel("sedan");
        araba1.setMotorHacmi(1800);
        araba1.setKapiSayisi(4);

        System.out.println("araba1 = " + araba1);




    }

    //KURAL: genel yazilim kurali.
    // butun degiskenler private yapilir.
    // yani kapsulleme kullanilir.
    // eger gerekiyorsa private kaldirilir.
}

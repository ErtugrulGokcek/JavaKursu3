package Gun33.EnumEk;

public class AylarMain {
    public static void main(String[] args) {

        Aylar ay = Aylar.AGUSTOS;

        switch (ay) {
            case OCAK:System.out.println(31);break;
            case SUBAT:System.out.println(28);break;
            case MART:System.out.println(31);break;
            case NISAN:System.out.println(30);break;
            case MAYIS:System.out.println(31);break;
            case HAZIRAN:System.out.println(30);break;
            case TEMMUZ:System.out.println(31);break;
            case AGUSTOS:System.out.println(31);break;
            case EYLUL:System.out.println(30);break;
            case EKIM:System.out.println(31);break;
            case KASIM:System.out.println(30);break;
            case ARALIK:System.out.println(31);break;

        }
        // yeni nasil yontemler

        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.isim = " + ay.isim);

    }
}

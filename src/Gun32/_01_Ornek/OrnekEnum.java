package Gun32._01_Ornek;

public class OrnekEnum {

    enum Aylar {
        OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN, TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
    }

    public static void main(String[] args) {

        int ayNo = 5;
        Aylar ay = Aylar.MAYIS;

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
        System.out.println("ay = " + ay);
        System.out.println("ay = " + ay.name());
        System.out.println("ay = " + ay.ordinal());

        for (Aylar a:Aylar.values())
            System.out.println(a.ordinal()+" = " + a);
    }
}

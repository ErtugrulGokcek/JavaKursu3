package Gun28._01_Ornek;

public class JavaStaticAndNonStaticMethods {
    public static void main(String[] args) {

        // 1. yontem Javanin kendi methodlariyla yapilan cevirme islemleri
        int sayi = 345;
        String strRakam = String.valueOf(sayi);
        int intRakam = Integer.parseInt(strRakam);

        //2. yontem kendi sinifimi yazayim ve oradan kullanayim
        Utility util = new Utility();
        strRakam = util.getString(sayi);
        intRakam = util.getInt(strRakam);

        // 3. yontem
        Math.max(3,4);

        strRakam = Utility.getString2(sayi);
        intRakam = Utility.getInt2(strRakam);



    }
}

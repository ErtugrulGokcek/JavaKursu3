package Gun06;

public class _07_StringContains {
    public static void main(String[] args) {
        // bir stringin icinde bir karakterin olup olmadigini boolean cinsinden true veya false dondurur

        String kelime="Merhaba Dunya";
        Boolean varMi= kelime.contains("a");
        System.out.println("varMi = " + varMi);

        System.out.println("varMi = " + kelime.contains("f"));
        System.out.println("varMi = " + kelime.contains("ya"));






    }
}

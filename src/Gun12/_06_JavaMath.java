package Gun12;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a = -12;
        int b = 4;

        System.out.println("a nin mutlak degeri = " + Math.abs(a));
        System.out.println("a ve b den buyuk olanı = " + Math.max(a,b));
        System.out.println("a ve b den kucuk olanı = " + Math.min(a,b));
        System.out.println("a nin karekoku = " + Math.sqrt(a));
        System.out.println("2 nin 3 uncu kuvveti = " + Math.pow(2,3));
        System.out.println("round 3.1 = " + Math.round(3.1));
        System.out.println("round 3.5 = " + Math.round(3.5));
        System.out.println("ceil 3.1 = " + Math.ceil(3.1)); // bu rakamdan en buyuk tamsayi 4
        System.out.println("floor 3.1 = " + Math.floor(3.1)); // bu rakamdan en kucuk tamsayi 3

    }
}

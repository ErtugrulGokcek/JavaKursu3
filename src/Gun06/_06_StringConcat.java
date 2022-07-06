package Gun06;

public class _06_StringConcat {
    public static void main(String[] args) {
        // Concat bir stringi digerine ekler

        String s1 = "Merhaba";
        String s2 = "Dunya";

        System.out.println("birlesik hali="+s1+s2);
        System.out.println("birlesik hali="+s1.concat(s2));
        System.out.println("birlesik hali="+s1.concat(" ").concat(s2)); // istedigin kadar eklenebilir




    }
}

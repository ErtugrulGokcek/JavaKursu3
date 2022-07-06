package Gun05;

import java.util.Scanner;

public class _10_Ornek8 {
    public static void main(String[] args) {
        // kullanicidan kac bilet istedigini (byte) ve sigorta isteyip istemedigini (boolean) alip ekrana yazdir

        Scanner oku=new Scanner(System.in);

        System.out.print("Kac Bilet Istiyorsunuz?=");

        byte bilet= oku.nextByte();

        System.out.print("Sigorta Istiyor musunuz?");

        boolean sigorta= oku.nextBoolean();

        System.out.println("bilet = " + bilet);
        System.out.println("sigorta = " + sigorta);



    }
}

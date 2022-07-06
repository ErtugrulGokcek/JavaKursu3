package Gun19;

public class _04_Java2DArray {
    public static void main(String[] args) {
        // 2 boyutlu 3x4 diziyi random 1-10 arasi sayilarla doldurup baska dongude yazdiriniz

        int [][] table = new int[3][4];

        for (int i =0; i<3;i++)
            for (int j = 0; j<4; j++)
                table[i][j]= (int) (Math.random() * 10);

        for (int i =0; i<3;i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(table[i][j]+" ");
            System.out.println();
        }

    }
}

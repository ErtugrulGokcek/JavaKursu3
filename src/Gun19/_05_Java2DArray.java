package Gun19;

public class _05_Java2DArray {
    public static void main(String[] args) {
        // {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et

        int table [][] = {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        int enb = table[0][0];
        for (int i=0;i<table.length;i++){
            for (int j=0;j<table[i].length;j++){

             if (table [i][j]>enb)
                 enb=table [i][j];

            }

        }
        System.out.println("enb = " + enb);

    }

}

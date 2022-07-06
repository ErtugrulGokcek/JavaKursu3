package Gun30.Soru1;

public  class Hesap {
    int yatan=0;
    int cekilen=0;


    private int bakiye=0;

    public void bakiyeGoster (){
        System.out.println(bakiye);
    }

    public void paraYatir (int gelenPara){
        this.bakiye=this.bakiye+gelenPara;
        this.yatan=this.yatan+gelenPara;
    }
    public void paraCek (int cekilenPara){
        this.bakiye=this.bakiye-cekilenPara;
        this.cekilen=this.cekilen+cekilenPara;
    }
}



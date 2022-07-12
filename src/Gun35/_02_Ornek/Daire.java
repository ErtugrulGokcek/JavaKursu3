package Gun35._02_Ornek;

public class Daire extends Sekil {

    private int yaricap;

    @Override
    public double getAlan() {
        return Math.PI * Math.pow(this.yaricap,2);
    }

    @Override
    public double getCevre() {
        return 2*Math.PI*this.yaricap;
    }
    public int getYaricap(){
        return yaricap;
    }
    public void setYaricap (int yaricap) {
        this.yaricap=yaricap;
    }

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }
}

package Gun35._01_Ornek;

public class Otobus extends Arac{
    private int yolcuKapasitesi;

    public Otobus(String renk, int motorHacmi, String model, int yolcuKapasitesi) {
        super(renk, motorHacmi, model); // miras alinan super class olarak adlandirilir
        // kendisi subclass

        setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return "Otobus{" +
                "yolcuKapasitesi=" + yolcuKapasitesi +" "+super.toString()+
                '}';
    }
}

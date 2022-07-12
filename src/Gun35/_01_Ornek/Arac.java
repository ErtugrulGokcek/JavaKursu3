package Gun35._01_Ornek;

public class Arac {
    private String renk;
    private int motorHacmi;
    private String model;

    public Arac(String renk, int motorHacmi, String model) {
        setRenk(renk);
        setMotorHacmi(motorHacmi);
        setModel(model);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", model='" + model + '\'' +
                '}';
    }
}

package Gun27._01_Ornek;

public class Person {
    //properties
    String name;
    String surname;
    int age;

    //method
    public void BilgiYazdir (){
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
    }
    public void getBithyear () {
        System.out.println("Birth year = " + (2022-age));
    }
    public void getInıtials (){
        System.out.println("Initials =" + name.toUpperCase().charAt(0)+". "+surname.toUpperCase().charAt(0)+".");
    }
}

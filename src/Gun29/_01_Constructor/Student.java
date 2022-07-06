package Gun29._01_Constructor;

public class Student {
    int id;
    String name;
    String surname;
    int classroom;

    public Student () {
        System.out.println("nesne olusturuldu");
    }
    public Student (int id1,String name1,String surname1, int classroom1) {
        System.out.println("nesne parametreli olusturuldu");
        id=id1;
        name=name1;
        surname=surname1;
        classroom=classroom1;
    }
    public Student (int id1,String name1,String surname1) {
        System.out.println("nesne parametreli olusturuldu");
        id=id1;
        name=name1;
        surname=surname1;
        classroom=0;
    }
}

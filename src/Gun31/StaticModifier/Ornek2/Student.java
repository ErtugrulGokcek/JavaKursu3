package Gun31.StaticModifier.Ornek2;

public class Student {

    int id;
    String name;
    String surname;

    static int i=0;

    public Student(String name, String surname) {
        this.id = ++i;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

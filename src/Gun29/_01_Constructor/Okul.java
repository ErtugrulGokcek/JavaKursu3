package Gun29._01_Constructor;

public class Okul {
    public static void main(String[] args) {
        //Bir student sinifi olusturunuz (id, name, surname, classromm (int)) eve bundan 3 adet ogrenci olsuturunuz


        Student s1 = new Student(); // () parametre yeri
        s1.id = 1;
        s1.name = "Ali Kemal";
        s1.surname = "Inal";
        s1.classroom = 11;
        System.out.println("s1.name = " + s1.name);

        Student s2 = new Student(); // () parametre yeri
        s2.id = 2;
        s2.name = "Metin";
        s2.surname = "Hasal";
        s2.classroom = 12;
        System.out.println("s2 = " + s2.name);

        Student s3 = new Student(3,"Yasin","Erkol",9);
        System.out.println("s3.name = " + s3.name);

        Student s4 = new Student(4,"Yasin","Erkol",9);
        Student s5 = new Student(5,"Murat","Erkol",9);
        Student s6 = new Student(6,"Isa","Erkol",9);
        Student s7 = new Student(7,"Onur","Erkol",9);


    }
}

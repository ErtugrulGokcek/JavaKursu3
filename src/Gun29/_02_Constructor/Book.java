package Gun29._02_Constructor;

public class Book {
        String name;
        int publishYear;
        String author;

    public Book() {

    }
    public Book (String name, int publishYear,String author){
        this.name = name;
        this.publishYear=publishYear;
        this.author=author;
    }
    public Book (String name, int publishYear){
        this.name = name;
        this.publishYear=publishYear;
        this.author="";
    }
    public void yazdir (){
        System.out.println(name+" "+publishYear+" "+author);
    }
    public String toString(){
        return name+" "+publishYear+" "+author;
    }
}


package Gun31.StaticModifier.todo;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {

        System.out.println("*****MENU*****"+ '\n' +
                "1-Add New Student"+'\n'+
                "2-Delete Student"+ '\n'+
                "3-Edit Student"+'\n'+
                "4-Search Student"+'\n'+
                "5-Student List"+'\n'+
                "6-Exit");

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please select the number: ");
        int number = sc1.nextInt();

        switch (number){
            case 1 : Scanner sc2 = new Scanner(System.in);
                System.out.println("Name :");
                System.out.println("Surname :");


        }




    }
}

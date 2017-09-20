package com.example;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> studentlist = new ArrayList<>();

        studentlist.add(new Student("Sally", "Fields",1, 1));
        studentlist.add(new Student("Englebert", "Humperdink",2,1));
        studentlist.add(new Student("Rick", "James", 3,1));
        studentlist.add(new Student("Zbigniew", "Brzezinski", 4, 1));
        studentlist.add(new Student("Milton", "Friedman", 5, 1));
        studentlist.add(new Student("John","Keynes", 6, 1));
        studentlist.add(new Student("Dante", "Alighieri", 7, 1));
        studentlist.add(new Student("Leon", "Trotsky", 8,1));
        studentlist.add(new Student("John", "Milton", 9, 1));
        studentlist.add(new Student("Duke", "Ellington", 10, 1));
        studentlist.add(new Student("Miles", "Davis", 11, 1));
        studentlist.add(new Student("Tyler", "Durden", 12,1));
        studentlist.add(new Student("Napoleon", "Bonaparte", 13, 1));
        studentlist.add(new Student("Harriet", "Stowe", 14, 1));
        studentlist.add(new Student("Emily", "Bronte", 15, 1));

        List<Teacher>teacherList = new ArrayList<>();

        teacherList.add(new Teacher("John", "Keating", 1, 1));
        teacherList.add(new Teacher("Louanne", "Johnson", 2, 1));
        teacherList.add(new Teacher("Maurice", "Phipps", 3, 1));

        

    }
}

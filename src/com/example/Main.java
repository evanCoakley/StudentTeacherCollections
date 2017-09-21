package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Main {


    public static void main(String[] args) {


        List<Student> studentlist = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();
        HashSet<Student> studentSet1 = new HashSet<>();
        HashSet<Student> studentSet2 = new HashSet<>();
        HashSet<Student> studentSet3 = new HashSet<>();
        HashMap<Teacher, HashSet<Student>> studentTeacherMap = new HashMap<>();


        for (int i = 0; i < 15; i++) {
            Student student = new Student(i + 1, 1, "First", "Last");
            studentlist.add(student);

            if (i < 5) {
                studentSet1.add(student);
            } else if (i < 10) {
                studentSet2.add(student);
            } else if (i < 15) {
                studentSet3.add(student);
            }
        }
        for (int i = 30; i < 33; i++) {
            Teacher teacher = new Teacher(i + 1, 1, "TFirst", "TLast");
            teacherList.add(teacher);
        }

        studentTeacherMap.put(teacherList.get(0), studentSet1);

        studentTeacherMap.put(teacherList.get(1), studentSet2);

        studentTeacherMap.put(teacherList.get(2), studentSet3);


        for (Teacher teacher : studentTeacherMap.keySet()) {
            System.out.println("Teacher ID = " + teacher.getId());
        }
        System.out.println();

        for ( Map.Entry<Teacher, HashSet<Student>> entry : studentTeacherMap.entrySet()) {
            System.out.println(entry.getKey().getId());

            for ( Student student : entry.getValue()) {
                System.out.println("Student ID = " + student.getId());

            }
        }


//        studentlist.add(new Student("Sally", "Fields"));
//        studentlist.add(new Student("Englebert", "Humperdink"));
//        studentlist.add(new Student("Rick", "James"));
//        studentlist.add(new Student("Zbigniew", "Brzezinski"));
//        studentlist.add(new Student("Milton", "Friedman"));
//        studentlist.add(new Student("John", "Keynes"));
//        studentlist.add(new Student("Dante", "Alighieri"));
//        studentlist.add(new Student("Leon", "Trotsky"));
//        studentlist.add(new Student("John", "Milton"));
//        studentlist.add(new Student("Duke", "Ellington"));
//        studentlist.add(new Student("Miles", "Davis"));
//        studentlist.add(new Student("Tyler", "Durden"));
//        studentlist.add(new Student("Napoleon", "Bonaparte"));
//        studentlist.add(new Student("Harriet", "Stowe"));
//        studentlist.add(new Student("Emily", "Bronte"));
//
//
//
//        teacherList.add(new Teacher("John", "Keating"));
//        teacherList.add(new Teacher("Louanne", "Johnson"));
//        teacherList.add(new Teacher("Maurice", "Phipps"));


    }
}
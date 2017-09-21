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
            Student student = new Student(i + 1, 1, "firstName", "lastName");
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


        for (Map.Entry<Teacher, HashSet<Student>> entry : studentTeacherMap.entrySet()) {
            System.out.println("Teacher ID = " + entry.getKey().getId());


            for (Student student : entry.getValue()) {
                System.out.println("Student ID = " + student.getId());

                

            }
        }


    }
}
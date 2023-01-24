package com.shreyas.app.controller;


import com.shreyas.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @GetMapping("/get/students")
    public List<Student> getStudents(){
        List listStudents= new ArrayList();
        Student student1= new Student("sunil","19","10","ssgmes");
        Student student2= new Student("prasad","24","10","ssgmes");
        Student student3= new Student("abhishek","30","10","ssgmes");
        Student student4= new Student("chinmay","41","10","ssgmes");

        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        return listStudents;

    }

    @GetMapping("/map/students")
    public Map mapStudents(){
        Map studentMap= new HashMap();
        Student student1= new Student("sunil","19","10","ssgmes");
        Student student2= new Student("prasad","24","10","ssgmes");
        Student student3= new Student("abhishek","30","10","ssgmes");
        Student student4= new Student("chinmay","41","10","ssgmes");

        studentMap.put(student1.getName(),student1);
        studentMap.put(student2.getName(),student2);
        studentMap.put(student3.getName(),student3);
        studentMap.put(student4.getName(),student4);
        return studentMap;

    }
}

package org.example.contraller;

import org.example.model.dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentContraller {

    @GetMapping
    public String getName(){
        return "Pasindu";
    }

    List<Student> studentsList = new ArrayList<>();

    @GetMapping("list")
    public List<Student> getNameList(){
        studentsList.add(new Student("S001","pasidnu","Sooriyawewa",21));
        studentsList.add(new Student("S002","Tharindu","Mathara",21));
        studentsList.add(new Student("S003","Navindu","Galle",21));

        return studentsList;
    }

    @PostMapping
    public void save(@RequestBody Student student){
        studentsList.add(student);
        System.out.println("OK");
    }

    @GetMapping("{word}")
    public String getWord(@PathVariable String word){
        return word;
    }

}

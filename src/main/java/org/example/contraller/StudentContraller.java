package org.example.contraller;

import org.example.model.dto.Student;
import org.example.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentContraller {

    StudentService studentService = new StudentService();

    @GetMapping("all")
    public ArrayList<Student> getAll(){
        return studentService.getAll();
    }

}

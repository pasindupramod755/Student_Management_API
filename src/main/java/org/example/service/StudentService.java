package org.example.service;

import org.example.model.dto.Student;
import org.example.repository.StudentRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();
    ArrayList<Student> studentList = new ArrayList<>();

    public ArrayList<Student> getAll(){
        try {
            ResultSet resultSet = studentRepository.getAll();
            while (resultSet.next()){
                studentList.add(
                        new Student(
                                resultSet.getString("id"),
                                resultSet.getString("name"),
                                resultSet.getString("address"),
                                resultSet.getInt("age")
                        ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }
}

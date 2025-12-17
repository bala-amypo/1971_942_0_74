package com.example.demo.Serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.service.StudentService;
import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;


@Service
public class StudentServiceImple implements StudentService{
    private final StudentRepositoru studentRepository;
    public StudentServiceImple(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public Stuentityt saveStudent(Stuentity student){
        return studentRepository.save()
    }

}
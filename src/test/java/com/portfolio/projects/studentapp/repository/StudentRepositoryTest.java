package com.portfolio.projects.studentapp.repository;

import com.portfolio.projects.studentapp.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent()
    {
        Student student = Student.builder()
                .emailId("matty@gmail.com")
                .firstName("Idowu")
                .lastName("Timi")
                //.guardianName("Lolade")
               // .guardianEmail("tobi@gmail.com")
               // .guardianMobile("08101590442")
                .build();
        studentRepository.save(student);

    }
    @Test
    public void saveStudentWithGuardian()
    {
        Student student = Student.builder()

                .build();

    }
    @Test
    public void printAllStudent()
    {
        List<Student> studentList =
                studentRepository.findAll();
        System.out.println("studentList =" +studentList);
    }

}
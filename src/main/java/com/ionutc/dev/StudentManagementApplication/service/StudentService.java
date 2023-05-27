package com.ionutc.dev.StudentManagementApplication.service;

import com.ionutc.dev.StudentManagementApplication.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}

package com.ionutc.dev.StudentManagementApplication.repository;

import com.ionutc.dev.StudentManagementApplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

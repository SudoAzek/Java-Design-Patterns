package com.mezonworks.dao_pattern.with_simple_student;

import java.util.List;

public interface StudentDAO {
    public List<Student> getAllStudent();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}

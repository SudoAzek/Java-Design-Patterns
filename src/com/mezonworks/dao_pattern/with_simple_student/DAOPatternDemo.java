package com.mezonworks.dao_pattern.with_simple_student;

public class DAOPatternDemo {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImplementation();

        // Print all students
        for(Student student : studentDAO.getAllStudent()) {
            System.out.println("Student: [ RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " }");
        }

        // Update the student
        Student student = studentDAO.getAllStudent().get(0);
        student.setName("Azamat");
        studentDAO.updateStudent(student);

        // Get the student
        studentDAO.getStudent(0);
        System.out.println("Student: [ RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}

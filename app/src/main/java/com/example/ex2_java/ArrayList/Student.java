package com.example.ex2_java.ArrayList;


import java.util.ArrayList;

class Student {
    int id;
    String name;
    double average;

    public Student(int id, String name, double average) {
        this.id = id;
        this.name = name;
        this.average = average;
    }

}

class StudentManager {
    ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int id) {
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.id == id) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Student with ID " + id + " removed.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            for (Student student : students) {
                System.out.println("ID: " + student.id + ", Name: " + student.name + ", Average: " + student.average);
            }
        }
    }

    public void findStudentById(int id) {
        boolean found = false;
        for (Student student : students) {
            if (student.id == id) {
                System.out.println("ID: " + student.id + ", Name: " + student.name + ", Average: " + student.average);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}

 class Main3 {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent(new Student(1, "John Doe", 85.5));
        studentManager.addStudent(new Student(2, "Alice Smith", 90.2));
        studentManager.addStudent(new Student(3, "Bob Johnson", 75.8));

        System.out.println("All students:");
        studentManager.displayAllStudents();

        System.out.println("\nFind student by ID:");
        studentManager.findStudentById(2);

        System.out.println("\nRemove student by ID:");
        studentManager.removeStudent(3);

        System.out.println("\nAll students after removal:");
        studentManager.displayAllStudents();
    }
}


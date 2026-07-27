package com.cognizant.mvc;

public class MVCPatternTest {

    public static void main(String[] args) {

        Student student =
                new Student("Anshuman", "23052783", "A");

        StudentView view =
                new StudentView();

        StudentController controller =
                new StudentController(student, view);

        System.out.println("Initial Student Details:");

        controller.updateView();

        System.out.println();

        System.out.println("Updated Student Details:");

        controller.setStudentName("Anshuman Routray");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
//
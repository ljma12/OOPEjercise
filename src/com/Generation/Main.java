package com.Generation;

import com.Generation.classes.Course;
import com.Generation.classes.Student;
import com.Generation.classes.StudentService;
import com.Generation.exceptions.CourseNotFoundException;

public class Main {
    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    
        studentService.addStudent(new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent(new Student( "Ian", "1040", 28 ) );
        studentService.addStudent(new Student( "Elise", "1050", 26 ) );
        studentService.addStudent(new Student( "Santiago", "1020", 33 ) );

        studentService.enrollStudents( "Math", "1030" );
        studentService.enrollStudents( "Math", "1020" );
        
        studentService.enrollStudents( "History", "1040" );
        studentService.enrollStudents( "History", "1050" );
        
        studentService.showAllCourses();
        studentService.showEnrolledStudents("Math");
        studentService.showEnrolledStudents("History");
    }
}
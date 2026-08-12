package services;
import models.*;

public class EnrollmentManager {
    public void enroll(Student student, Course course) {
        System.out.println(student.getName() + " successfully enrolled to " + course.getTitle());
    }
}
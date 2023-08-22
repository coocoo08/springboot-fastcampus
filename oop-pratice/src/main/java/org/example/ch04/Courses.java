package org.example.ch04;

import java.util.List;

public class Courses {
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCoutseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
//        double multipliadCreditAndCourseGrade = 0;
//        for (Course course : courses) {
//            multipliadCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//        return multipliadCreditAndCourseGrade;
    }

    public int calculateTotalCompleteCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}

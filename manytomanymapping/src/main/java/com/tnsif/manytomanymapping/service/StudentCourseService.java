package com.tnsif.manytomanymapping.service;

import com.tnsif.manytomanymapping.entity.Course;
import com.tnsif.manytomanymapping.entity.Student;

public interface StudentCourseService {
    void addStudentToCourse(Student student, Course course);
}

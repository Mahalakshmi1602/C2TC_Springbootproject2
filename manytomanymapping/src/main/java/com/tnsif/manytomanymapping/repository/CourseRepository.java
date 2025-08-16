package com.tnsif.manytomanymapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.manytomanymapping.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
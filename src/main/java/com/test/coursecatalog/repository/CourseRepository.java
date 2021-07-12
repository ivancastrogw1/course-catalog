package com.test.coursecatalog.repository;

import com.test.coursecatalog.domain.Course;
import java.time.Instant;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findAll();

    List<Course> findByDateAfter(Instant date);
}

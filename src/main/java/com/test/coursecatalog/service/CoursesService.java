package com.test.coursecatalog.service;

import com.test.coursecatalog.domain.Course;
import com.test.coursecatalog.repository.CourseRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CoursesService {

    private final Logger log = LoggerFactory.getLogger(CoursesService.class);

    private final CourseRepository courseRepository;

    public CoursesService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getAllAvailableCourses() {
        log.debug("Getting all available courses");
        return courseRepository.findAll();
    }
}

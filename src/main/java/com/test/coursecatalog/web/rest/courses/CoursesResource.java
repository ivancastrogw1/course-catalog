package com.test.coursecatalog.web.rest.courses;

import com.test.coursecatalog.domain.Course;
import com.test.coursecatalog.service.CoursesService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CoursesResource {

    private final Logger log = LoggerFactory.getLogger(CoursesResource.class);

    private final CoursesService coursesService;

    public CoursesResource(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    @GetMapping("/allCourses")
    public List<Course> getAllCourses() {
        log.debug("REST request to get all available courses");
        return coursesService.getAllAvailableCourses();
    }
}

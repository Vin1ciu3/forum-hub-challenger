package com.api.forumHub.controller;

import com.api.forumHub.domain.course.CourseDTO;
import com.api.forumHub.domain.course.CourseRequest;
import com.api.forumHub.domain.course.CourseService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/courses")
@SecurityRequirement(name = "bearer-key")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<CourseDTO> created(@RequestBody @Valid CourseRequest request) {
        CourseDTO newCourse = courseService.saveCourse(request);

        URI uri = URI.create("/courses/" + newCourse.id());

        return ResponseEntity.created(uri).body(newCourse);
    }

    @GetMapping("/search")
    public ResponseEntity<List<CourseDTO>> getCourseName(@RequestParam String name) {
        return ResponseEntity.ok(courseService.getCourseName(name));
    }

    @GetMapping
    public ResponseEntity<List<CourseDTO>> getCourses() {
        return ResponseEntity.ok(courseService.getCourses());
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}

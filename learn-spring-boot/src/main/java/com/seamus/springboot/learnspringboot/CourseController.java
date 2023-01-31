package com.seamus.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//https://localhost:8080/courses
// Course: id, name, author
// [
//   {
//     "id": 1,
//     "name": "Learn AWS",
//     "author": "Seamus"
//   }
// ]

// REST API Controller decorator
@RestController
public class CourseController {

    // Map URL request to a method
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        //System.out.println(new Course(1, "Test", "Seamus"));
        return Arrays.asList(
            new Course(1, "Learn AWS", "Seamus"),
            new Course(2, "Learn DEVOPs", "Seamus"),
            new Course(3, "Learn Azure2", "Seamus")
        );
    }
}

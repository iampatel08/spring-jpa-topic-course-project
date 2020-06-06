package com.example.springData.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class courseController {

    @Autowired
    private courseService courseService;

    @RequestMapping("/topics")
    public List<course> getAllCourses()
    {
        return courseService.getAllCourses();
    }

    @RequestMapping("/topics/{id}")
    public course getCourse(@PathVariable String id)
    {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics")
    public void addCourse(@RequestBody course course)
    {
        courseService.addCourse(course);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
    public void updateCourse(@RequestBody course course, @PathVariable String id)
    {
         courseService.updateCourse(id, course);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
    public void deleteCourse(@PathVariable String id)
    {
        courseService.deleteCourse(id);
    }
}

package com.example.springData.courses;

import com.example.springData.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class courseController {

    @Autowired
    private courseService courseService;

    @RequestMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id)
    {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable String topicId)
    {
       course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId , @PathVariable String id)
    {
        course.setTopic(new Topic(topicId,"",""));
         courseService.updateCourse(course);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{topicId}/courses/id}")
    public void deleteCourse(@PathVariable String id)
    {
        courseService.deleteCourse(id);
    }
}

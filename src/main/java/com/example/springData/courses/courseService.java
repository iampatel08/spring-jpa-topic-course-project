package com.example.springData.courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class courseService {

    @Autowired
    private courseRepository courseRepository;


    public List<Course> getAllCourses(String topicId){

        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id)
    {
        Optional<Course> result = courseRepository.findById(id);
        Course theCourse = null;
        theCourse = result.get();
        return theCourse;
    }

    public void addCourse(Course course) {

        courseRepository.save(course);
    }

    public void updateCourse(Course course) {

        courseRepository.save(course);
    }

    public void deleteCourse(String id) {

        courseRepository.deleteById(id);
    }
}

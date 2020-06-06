package com.example.springData.courses;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class courseService {

    @Autowired
    private courseRepository courseRepository;

    private List<course> courses = new ArrayList<>(Arrays.asList(
            new course("001","Introduction to C","History"),
            new course("002","Fundamental of C","Fundamentals"),
            new course("003","Output Statement","Fundamentals"),
            new course("004","Input Statement","Fundamental")
            ));

    public List<course> getAllCourses(){

        List<course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    public course getCourse(String id)
    {
        Optional<course> result = courseRepository.findById(id);
        course theCourse = null;
        theCourse = result.get();
        return theCourse;
    }




    public void addCourse(course course) {

        courseRepository.save(course);
    }

    public void updateCourse(String id, course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {

        courseRepository.deleteById(id);


    }
}

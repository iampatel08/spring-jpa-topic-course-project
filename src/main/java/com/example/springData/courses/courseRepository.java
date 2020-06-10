package com.example.springData.courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface courseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String topicId);
}

package com.example.springData.courses;

import org.springframework.data.repository.CrudRepository;

public interface courseRepository extends CrudRepository<course, String> {
}

package com.example.springData.topics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {
    @RequestMapping("")
    public String index()
    {
        return "Welcome to topics project ";
    }
}



        //GET     /topics     Get all topics
        //GET     /topics/id     Get that topic
        //POST     /topics     Create new topic
        //PUT     /topics/id     Upgrade that topic
        //Delete     /topics/id     Delete that topic
package com.example.springData.topics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class topicService {

    @Autowired
    private topicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("001","Introduction to C","History"),
            new Topic("002","Fundamental of C","Fundamentals"),
            new Topic("003","Output Statement","Fundamentals"),
            new Topic("004","Input Statement","Fundamental")
            ));

    public List<Topic> getAllTopics(){

        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id)
    {
        Optional<Topic> result = topicRepository.findById(id);
        Topic theTopic = null;
        theTopic = result.get();
        return theTopic;
    }




    public void addTopic(Topic topic) {

        topicRepository.save(topic);
        //topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {

        topicRepository.deleteById(id);
        //topics.removeIf(t -> t.getId().equals(id));


    }
}

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

    private List<topic> topics = new ArrayList<>(Arrays.asList(
            new topic("001","Introduction to C","History"),
            new topic("002","Fundamental of C","Fundamentals"),
            new topic("003","Output Statement","Fundamentals"),
            new topic("004","Input Statement","Fundamental")
            ));

    public List<topic> getAllTopics(){

        List<topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public topic getTopic(String id)
    {
        Optional<topic> result = topicRepository.findById(id);
        topic theTopic = null;
        theTopic = result.get();
        return theTopic;
    }




    public void addTopic(topic topic) {

        topicRepository.save(topic);
        //topics.add(topic);
    }

    public void updateTopic(String id,topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {

        topicRepository.deleteById(id);
        //topics.removeIf(t -> t.getId().equals(id));


    }
}

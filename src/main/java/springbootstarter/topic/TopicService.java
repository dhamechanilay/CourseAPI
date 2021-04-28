package springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics() {
        List<Topic> topics= new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).get();
    }

    public Topic addTopics(Topic topic) {
        return topicRepository.save(topic);
    }

    public Topic updateTopic(Topic topic, String id) {
        return topicRepository.save(topic);
    }

    /*public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }*/
}

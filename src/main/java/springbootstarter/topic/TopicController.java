package springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private  TopicService topicService;


    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
    return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public Topic addTopics(@RequestBody Topic topic) {
        return topicService.addTopics(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        return topicService.updateTopic(topic, id);
    }

    /*@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }*/
}

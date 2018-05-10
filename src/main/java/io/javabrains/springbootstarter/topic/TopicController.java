package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		topics.add(new Topic("1", "Spring1", "Spring-1"));
		topics.add(new Topic("2", "Spring2", "Spring-2"));
		topics.add(new Topic("3", "Spring3", "Spring-3"));
		return topics;
	}

}

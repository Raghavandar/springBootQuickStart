package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopicDetail(@PathVariable String id) {
		return topicService.getTopicDetail(id);
	}
	
	@PostMapping("/topics")
	public List<Topic> addTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}
	
	@PutMapping("/topics/{id}")
	public List<Topic> updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		return topicService.updateTopic(topic, id);
	}
	
	@DeleteMapping("/topics/{id}")
	public List<Topic> deleteTopic(@PathVariable String id) {
		return topicService.deleteTopic(id);
	}
	
	@PatchMapping("/topics/{id}")
	public List<Topic> patchTopic(@RequestBody Topic topic, @PathVariable String id) {
		return topicService.patchTopic(topic, id);
	}

}

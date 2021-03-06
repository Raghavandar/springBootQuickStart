package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository repository;
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("1", "Spring1", "Spring-1"),
			new Topic("2", "Spring2", "Spring-2"),
			new Topic("3", "Spring3", "Spring-3")));
	
	/*public List<Topic> getAllTopics() {
		return topics;
	}*/
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		for (Topic topic : repository.findAll()) {
			topics.add(topic);
		}
		return topics;
	}
	
	/*public Topic getTopicDetail(String id) {
		Topic topic = null;
		for (Topic t : topics) {
			if(t.getId().equals(id)) {
				topic = t;
			}
		}
		return topic;
	}*/
	
	public Topic getTopicDetail(String id) {
		return repository.findOne(id);
	}
	
	/*public List<Topic> addTopic(Topic topic) {
		topics.add(topic);
		return topics;
	}*/
	
	public List<Topic> addTopic(Topic topic) {
		repository.save(topic);
		return topics;
	}
	
	/*public List<Topic> updateTopic(Topic topic, String id) {
		for (int i=0; i<topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		return topics;
	}*/
	
	public List<Topic> updateTopic(Topic topic, String id) {
		repository.save(topic);
		return topics;
	}
	
	/*public List<Topic> deleteTopic(String id) {
		for (int i=0; i<topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.remove(i);
			}
		}
		return topics;
	}*/
	
	public List<Topic> deleteTopic(String id) {
		repository.delete(id);
		return topics;
	}

	public List<Topic> patchTopic(Topic topic, String id) {
		//repository.save(topic);
		for (int i=0; i<topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
			}
		}
		return topics;
	}

}

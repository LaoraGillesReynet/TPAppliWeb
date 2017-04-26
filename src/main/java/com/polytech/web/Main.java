package com.polytech.web;

import com.polytech.configuration.ApplicationConfiguration;
import com.polytech.models.Post;
import com.polytech.services.business.PublicationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		PublicationService publicationService = applicationContext.getBean(PublicationService.class);

		Post post = new Post("Coucou", "user");
		publicationService.post(post);

		post = new Post("Salut", "user");
		publicationService.post(post);

		post = new Post("Hello", "user");
		publicationService.post(post);

		List<Post> posts = publicationService.fetchAll();
		System.out.println(posts);

	}
}

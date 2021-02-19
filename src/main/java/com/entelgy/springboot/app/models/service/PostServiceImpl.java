package com.entelgy.springboot.app.models.service;


import java.util.Arrays;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entelgy.springboot.app.models.Post;
import com.entelgy.springboot.app.models.PostNew;

@Service("serviceRestTemplate")
public class PostServiceImpl implements IPostService {

	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<PostNew> findAll() {
		// TODO Auto-generated method stub
		List<Post> posts = Arrays
				.asList(clienteRest.getForObject("https://jsonplaceholder.typicode.com/comments", Post[].class));

		return posts
				.stream()
				.map(p -> new PostNew(p.getPostId(), p.getId(), p.getEmail()))
				.collect(Collectors.toList());
		
	}

}

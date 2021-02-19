package com.entelgy.springboot.app.models.service;

import java.util.List;

import com.entelgy.springboot.app.models.PostNew;

public interface IPostService {

	
	public List<PostNew> findAll();
}

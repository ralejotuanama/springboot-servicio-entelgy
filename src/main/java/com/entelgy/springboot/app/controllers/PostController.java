package com.entelgy.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entelgy.springboot.app.models.PostNew;
import com.entelgy.springboot.app.models.service.IPostService;

@RestController
@RequestMapping("/entelgy")
public class PostController {
	
	
	@Autowired
	private IPostService service;
	
	@GetMapping("/listar")
	public List<PostNew> listar(){
		
		List<PostNew> lista = service.findAll();
		
		return lista;
	}
	

}

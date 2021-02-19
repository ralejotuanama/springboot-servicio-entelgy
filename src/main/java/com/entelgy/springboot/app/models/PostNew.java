package com.entelgy.springboot.app.models;

public class PostNew {

	private Integer postId;
	private Integer id;
	private String email;
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PostNew(Integer postId, Integer id, String email) {
		
		this.postId = postId;
		this.id = id;
		this.email = email;
	}
	
}

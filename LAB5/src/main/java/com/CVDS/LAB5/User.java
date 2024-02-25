package com.CVDS.LAB5;

public class User {
	 private Integer userId;
	 private Integer id;
	 private String title;
	 private Boolean completed;
	
	 
	 public Integer getId() {
	  return id;
	 }
	 public void setId(Integer id) {
	  this.id = id;
	 }
	 
	 public Integer getUserId() {
		  return userId;
		 }
		 public void setUserId(Integer userId) {
		  this.userId = userId;
	}
	  
	 public String getTitle() {
	  return title;
	 }
	 public void setTitle(String title) {
	  this.title = title;
	 }
	 public boolean getCompleted() {
	  return completed;
	 }
	 public void setCompleted(boolean completed) {
	  this.completed = completed;
	 }
	 
	}
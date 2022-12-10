package com.example.kagazkalam.kagazkalam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	
	@Id
	@Column(name="uid")
	public String uid;
	public String name;
	public String email;
	public int age;
	public String photoURL;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String uid, String name, String email, int age, String photoURL) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.age = age;
		this.photoURL = photoURL;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhotoURL() {
		return photoURL;
	}
	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}
	
	
}

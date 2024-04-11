package com.telsuko.springJDBCDemo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component

@Scope("prototype")

public class Alien {
	private int Id;
	private String Name;
	private String  Tech;
	@Override
	public String toString() {
		return "Alien [Id=" + Id + ", Name=" + Name + ", Tech=" + Tech + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTech() {
		return Tech;
	}
	public void setTech(String tech) {
		Tech = tech;
	}

	
		
	}



package com.yxt.test;

import java.util.ArrayList;
import java.util.List;

public class Cat {
	 
	private int id;
	
	private String name;
	
	public Cat() {
	}
	
	
	public Cat(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public static void main(String[] args) {
		System.out.println("123312");
		System.out.println("23142");
		List<Cat> cats = new ArrayList<>();
		cats.add(0, new Cat(1,"Max"));
		cats.add(1,new Cat(2, "Happy!"));
		
		for(Cat cat : cats) {
			System.out.println(cat.getId()+"name:"+cat.getName());
		}
		
		
	}
}

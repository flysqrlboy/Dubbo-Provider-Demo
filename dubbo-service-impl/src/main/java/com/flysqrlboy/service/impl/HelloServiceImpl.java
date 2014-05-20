package com.flysqrlboy.service.impl;

import com.flysqrlboy.service.bean.Person;
import com.flysqrlboy.service.interf.HelloService;


public class HelloServiceImpl implements HelloService {

	public Person getPerson(String name, int age) {
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		return person;
	}

}

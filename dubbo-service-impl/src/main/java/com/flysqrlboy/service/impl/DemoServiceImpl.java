package com.flysqrlboy.service.impl;

import com.flysqrlboy.service.interf.DemoService;


public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hi " + name;
	}

	public int getAccount(int account) {
		return account;
	}

}

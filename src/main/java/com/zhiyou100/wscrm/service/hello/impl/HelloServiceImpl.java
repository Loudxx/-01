package com.zhiyou100.wscrm.service.hello.impl;

import org.springframework.transaction.annotation.Transactional;

import com.zhiyou100.wscrm.service.helllo.IHelloService;
@Transactional
public class HelloServiceImpl implements IHelloService {

	public String sayHello(String name) {
		System.out.println("基于CXF开发的服务端sayHello方法被调用了。。。");
		return "hello" + name;
	}

	
}

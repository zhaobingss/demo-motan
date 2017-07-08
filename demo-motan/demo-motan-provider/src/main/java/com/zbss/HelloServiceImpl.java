package com.zbss;

import com.zbss.api.HelloService;

/**
 * Created by zhaobing on 2017/7/8.
 */
public class HelloServiceImpl implements HelloService {
	@Override
	public String hello(String name) {
		return "hello "+name;
	}
}

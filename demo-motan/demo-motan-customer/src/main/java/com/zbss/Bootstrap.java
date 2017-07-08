package com.zbss;

import com.zbss.api.HelloService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaobing on 2017/7/8.
 */
public class Bootstrap {
	public static void main(String[] args) {
		try {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-motan.xml");
			System.out.println("server start...");

			HelloService service = (HelloService) applicationContext.getBean("helloService");

			String str = service.hello("Li Lei");

			System.out.println(str);

		} catch (BeansException e) {
			e.printStackTrace();
			System.out.println("server start failed !");
		}
	}
}

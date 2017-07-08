package com.zbss;

import com.weibo.api.motan.common.MotanConstants;
import com.weibo.api.motan.util.MotanSwitcherUtil;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaobing on 2017/7/8.
 */
public class Bootstrap {

	public static void main(String[] args) {
		try {
			// 这一句必须加上否则注册不到注册中心
			MotanSwitcherUtil.setSwitcherValue(MotanConstants.REGISTRY_HEARTBEAT_SWITCHER, true);
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-motan.xml");
			System.out.println("server start...");
		} catch (BeansException e) {
			e.printStackTrace();
			System.out.println("server start failed !");
		}
	}

}

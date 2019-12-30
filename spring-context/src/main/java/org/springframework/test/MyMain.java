package org.springframework.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description TODO
 * @Author lhj
 * @create 2019/12/30 0030 15:16
 */
public class MyMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		AppConfig config = context.getBean(AppConfig.class);
		System.out.println(config);
	}
}

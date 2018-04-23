package cn.itcast.a_hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.bean.Car;
import cn.itcast.bean.User;

public class Demo {
	@Test
	public void fun1(){
		
		//加载spring工厂类
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2 通过工厂方法获得user bean 实例
	
	
		User u = (User) ac.getBean("user");
		//3 鎵撳嵃user瀵硅薄
		System.out.println(u);
		
		
	}
	
	@Test
	public void fun2(){
		
		//加载spring工厂类
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2 通过工厂方法获得user bean 实例

		User u = (User) ac.getBean("user2");
		//3 鎵撳嵃user瀵硅薄
		System.out.println(u);
		
		
	}
	@Test
	public void fun3() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("cn/itcast/cjfxtext/applicationContext.xml");
		User u = (User) ac.getBean("user");
		System.out.println(u);
	}
	@Test
	public void fun4() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("cn/itcast/cjfxtext/applicationContext.xml");
		Car u = (Car) ac.getBean("rcar");
		System.out.println(u.getColor());
	}
}

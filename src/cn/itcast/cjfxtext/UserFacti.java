package cn.itcast.cjfxtext;

import cn.itcast.bean.User;

public class UserFacti {
	private String name;
	private Integer age;
	public static  User createUser() {
		
		System.out.println("我是静态工厂方法");
		return new User();
	}
	
public  User createUser1() {
		
		System.out.println("我是动态工厂"
				+ "方法");
		return new User();
	}
}

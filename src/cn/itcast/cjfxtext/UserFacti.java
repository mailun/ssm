package cn.itcast.cjfxtext;

import cn.itcast.bean.User;

public class UserFacti {
	private String name;
	private Integer age;
	public static  User createUser() {
		
		System.out.println("���Ǿ�̬��������");
		return new User();
	}
	
public  User createUser1() {
		
		System.out.println("���Ƕ�̬����"
				+ "����");
		return new User();
	}
}

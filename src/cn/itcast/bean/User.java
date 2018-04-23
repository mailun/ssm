package cn.itcast.bean;

public class User {
	
	public  Car  car;
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public User() {
			System.out.println("User无参构造方法!!!!");
	}



	@Override
	public String toString() {
		return "User [car=" + car + ", name=" + name + ", age=" + age + "]";
	}



	private String name;
	private Integer age;

	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void init(){
		System.out.println("初始化方法!");
	}
	public void destory(){
		System.out.println("实例的销毁方法!");
	}

}

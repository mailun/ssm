package cn.itcast.bean;

public class Car {
private String name;
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Car [name=" + name + ", color=" + color + "]";
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
private String color;
}

package com.example.demo.domain;
/**
 * @author jingyangTan
 * @version $Id$
 * @since 2020/1/9
 */
public class OneObject {

	private String name;

	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "OneObject{" + "name='" + name + '\'' + ", age='" + age + '\'' + '}';
	}
}

package com.web.pojo;
// Generated 2019-12-18 21:11:26 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Person generated by hbm2java
 */
public class Person implements java.io.Serializable {

	private long id;
	private String name;
	private String sex;
	private Date bornDate;

	public Person() {
	}

	public Person(long id, String name, String sex, Date bornDate) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.bornDate = bornDate;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBornDate() {
		return this.bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}

}

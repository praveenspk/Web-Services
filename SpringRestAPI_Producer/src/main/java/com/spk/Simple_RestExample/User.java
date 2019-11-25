package com.spk.Simple_RestExample;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private String name;
	private Integer id;
	private Long mobile;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, Integer id, Long mobile) {
		super();
		this.name = name;
		this.id = id;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", mobile=" + mobile + "]";
	}

}

package com.rishav.myfirsthibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Skill {
	
	@Id
	private int sk_id;
	private String sk_name;
	public int getSk_id() {
		return sk_id;
	}
	public void setSk_id(int sk_id) {
		this.sk_id = sk_id;
	}
	public String getSk_name() {
		return sk_name;
	}
	public void setSk_name(String sk_name) {
		this.sk_name = sk_name;
	}
	@Override
	public String toString() {
		return "Skill [sk_id=" + sk_id + ", sk_name=" + sk_name + "]";
	}
	
	
	

}

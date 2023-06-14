package com.example.dto;

import java.util.List;

public class MemInfoVO {
	//id name num code
	private int id;
	private String name;
	private String num;
	private String code;
	private List<String> mcode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<String> getMcode() {
		return mcode;
	}
	public void setMcode(List<String> mcode) {
		this.mcode = mcode;
	}
	@Override
	public String toString() {
		return "MemInfoVO [id=" + id + ", name=" + name + ", num=" + num + ", code=" + code + "]";
	}
	
	
	
	
	
	
	
}

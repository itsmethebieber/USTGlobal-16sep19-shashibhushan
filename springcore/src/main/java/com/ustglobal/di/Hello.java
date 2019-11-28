package com.ustglobal.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component("hello")
public class Hello {
	private String msg;
	private Map<String, Integer>map;
	
	public Map<String , Integer> getMap(){
		return map;
	}
	public void setMap(Map<String,Integer> map) {
		this.map = map;
	}

	public String getMsg() {
		
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	@PostConstruct
	public void init() {
		System.out.println("Init from hello");
	}
    
	@PreDestroy // method will execute before destroy
	public void destroy() {
		System.out.println("destroy from hello");
	}
}

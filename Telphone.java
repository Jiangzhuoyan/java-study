package com.imooc;

public class Telphone {
	//属性
	float screen;
	float cpu;
	float mem;
	//方法
	void call(){
		System.out.println("Telphone有打电话的功能");
	}
	void sendMessage(){
		System.out.println("screen:"+screen+"cpu:"+cpu+"mem:"+mem+" Telphone有发短信的功能");
	}
}

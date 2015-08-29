package com.hand.aop;




public class OperateLogger {
	
	public void before(){
		System.out.println("Before Insert Film Data");
	}
	
	public void after(){
		System.out.println("After Insert Film Data");
	}
}

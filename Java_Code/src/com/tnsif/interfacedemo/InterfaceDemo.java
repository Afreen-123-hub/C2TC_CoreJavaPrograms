package com.tnsif.interfacedemo;

interface School{
	void student();
	
}

public class InterfaceDemo implements School {
	public void student(){
		System.out.println("Hello");
	}
	 public static void main(String args[]) {
		 InterfaceDemo scl=new InterfaceDemo();
		 scl.student();
	 }

}

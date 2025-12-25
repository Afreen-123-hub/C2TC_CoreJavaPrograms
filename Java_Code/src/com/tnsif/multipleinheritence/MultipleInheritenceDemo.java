package com.tnsif.multipleinheritence;
interface A{
	void displayA();
}
interface B{
	void displayB();
}
class C implements A,B{
	
	@Override
	public void displayA() {
		System.out.println("Interface A method");
	}
	
	@Override
	public void displayB() {
		System.out.println("Interface B method");
	}

}


public class MultipleInheritenceDemo {

	public static void main(String[] args) {
		C obj = new C();
		obj.displayA();
		obj.displayB();

	}

}

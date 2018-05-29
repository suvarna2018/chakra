package com.sbi.loans.homeloans;

public class FristClass implements SecondClass {
	int a=12, b=12,result=0;
	public void addition()
	{
		result=a+b;
		System.out.println("addition of a&b are:"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FristClass obj=new FristClass();
		obj.addition();
		obj.multiplication();
		

	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		System.out.println("multiplication override in SecondClass");
	}

}
 
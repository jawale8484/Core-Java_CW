package exception_handling;

import java.util.Scanner;

/*
13.	WAP to show the usage of throw by creating a user defined 
exception and handle it using try catch.*/


class UserdefineException extends Exception{
	public UserdefineException(String s) {
		super(s);
	}
}


public class Userdefine_exception_13{
	void getage(int age)throws UserdefineException {
		
		if(age<18) {
			throw new UserdefineException("Sorry...Less than 18");
		}
	}
	public static void main(String[] args) throws UserdefineException {
		Userdefine_exception_13 ob=new Userdefine_exception_13();	
		
	
		try {
			ob.getage(12);
		} catch (UserdefineException e) {
		System.out.println(e.getMessage());
		}
	}
}


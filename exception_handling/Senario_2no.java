package exception_handling;

class InvalidCountryException extends Exception {
	public InvalidCountryException(String s) {
		super(s);
	}
}
class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		super(s);
	}
}

public class Senario_2no {
	void registerprofile(String userName , int age, String country) throws InvalidCountryException,InvalidAgeException {
		
		if(!(country.equalsIgnoreCase("india"))) {
			throw new InvalidCountryException("User Outside india cannot be register");
		}else if(age<18) {
			throw new InvalidAgeException("user is minnor"); 
		}
	}
	public static void main(String[] args) throws InvalidCountryException, InvalidAgeException {
		Senario_2no ob=new Senario_2no();
		ob.registerprofile("vaibhav", 15, "india");
	}
}

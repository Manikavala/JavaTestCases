package in.java.test;

class Test2 {
	static void valid(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("Not Elegible");
		else
			System.out.println("Welcome to vote");
	}

	public static void main(String[] args) {
		try {
			valid(20);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String s) {
		super(s);
	}
}
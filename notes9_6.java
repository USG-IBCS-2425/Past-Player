class notes9_6{
	public static void main(String[] args) {
		//data in java needs to have a type declared (when you first define it.
		int x = 5;

		//java will turn this into 4.0
		float y = 4;
		double z = 5.2;

		//booleans are either true or false
		boolean val = true;
		char mychar = 'A';
		String name = "Vera";

		System.out.println(x);
		System.out.println(y + z);

		//numerical data treats operators with math
		//string data treats operators with concatenation
		System.out.println(name + name + name);

		//java operators
		// +, -, *, /, %, ++, --

		//modulo operator calculates the remainder
		System.out.println(20 % 3);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);

	}
}
class hw9_6{
	public static void main(String[] args) {
		String myName = "Vera";
		String date = "September 6th";
		System.out.println(myName);
		System.out.println(date);
		System.out.println();
		System.out.println();

		int numStudents = 5;
		System.out.println(numStudents + " students are in our class");
		System.out.println("new student is enrolled in the class!");
		numStudents= numStudents + 1;
		System.out.println(numStudents + " students are in our class");

		if(numStudents < 4){
			System.out.println("class is canceled");
		}
		else{
			System.out.println("class will continue");
		}

		int numFirstName = myName.length();
		numStudents = numStudents - numFirstName;

		if(numStudents < 4){
			System.out.println("class is canceled");
		}
		else{
			System.out.println("class will continue");
		}


		numStudents = 7;

		//e
		boolean remainder = false;

		if(numStudents % 3 == 0){
			remainder = true;

		}
		else{
			remainder = false;
		}


		if(remainder == true){
			System.out.println("Number of groups created: " + numStudents / 3);
		}
		else{
			System.out.println(3 - (numStudents % 3) + " more students would need to be added.");
		}



	}
}
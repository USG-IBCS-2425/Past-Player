import java.util.*;

class Student {
	// two instance variables for a student
	// 1. their raffle number
	// 2. their name
	int rafNum;
	String name;

	// constructor method for student creates
	// each student with a random raffle number
	public Student(String n) {
		name = n;
		rafNum = (int)(Math.random()*10000);
	}

	// getters for the instance variables
	public int getNum() {
		return rafNum;
	}

	public String getName() {
		return name;
	}
}


class Raffle {
	// we need an array for students and an array of raffle nums
	Student[] sArr;
	int[] rafNums;
	String winners;

	// constructor for raffle requires giving it
	// a student array as input
	public Raffle(Student[] s) {
		// the student array should just be whatever
		// was passed in as the parameter
		sArr = s;
		winners = "";
		// need to create a empty array of integers first
		rafNums = new int[s.length];

		// loop through the array to set values
		// equal to each student's number
		for (int i = 0; i < sArr.length; i++) {

			// sArr[i] is a student
			rafNums[i] = sArr[i].getNum();
		}
	}

	// use a loop to print each number in the array
	public void printRafNums() {
		for (int n : rafNums) {
			System.out.println(n);
		}
	}

	public Student getWinner() {
		// choose an integer between 0-4
		int choice = (int)(Math.random()*sArr.length);

		Student tempWinner = sArr[choice];
		String tempName = tempWinner.getName();


		if(winners.contains(sArr[choice].getName())){
			choice = (int)(Math.random()*sArr.length);
		}

		//print the winning number
		System.out.println("The winning number is: " + rafNums[choice]);

		return sArr[choice];

	}
}

class hwDemo {
	public static void main(String[] args) {
		// create student instances
		Student s1 = new Student("A");
		Student s2 = new Student("B");
		Student s3 = new Student("C");
		Student s4 = new Student("D");
		Student s5 = new Student("E");
		// create the student array
		Student[] s = {s1, s2, s3, s4, s5};

		Raffle r = new Raffle(s);
		r.printRafNums();
		for (int i =0; i<3; i++){
			Student win = r.getWinner();
		System.out.println(win.getName() + " is the winner!");

		}

	}
}
import java.util.*;

class Pset4{
	public static void main(String[] args) {

		Student[] students = new Student[10];

		students[0] = new Student("a");
		students[1] = new Student("b");
		students[2] = new Student("c");
		students[3] = new Student("d");
		students[4] = new Student("e");
		students[5] = new Student("f");
		students[6] = new Student("g");
		students[7] = new Student("h");
		students[8] = new Student("i");
		students[9] = new Student("j");

		Raffle raffle = new Raffle(students);
		raffle.chooseWinner();
		

		for (String winner : winners) {
			System.out.println(winner);
		}

		Fibonnacci b = new Fibonnacci();
		b.updateNum(5);
		b.printSequence();
	}
}

class Raffle{
	//student is a data type, we created the datat type---class
	Student[] students;
	String[] winners;
	int[] raffleNums;

	public Raffle(Student[] s){
		students = s;
	}

	public String[] chooseWinner(){
		winners = new String[3];
		for(int i = 0;i < 3; i++){
			int choice = (int)(Math.random()*10);
			winners[i] = students[choice].getName() + students[choice].getRaffleNum();
		}
		return winners;
		
	}

}

class Student{
	String name;
	int raffleNum;

	public Student(String studentName){
		name = studentName;
		raffleNum = (int)(Math.random()*10000);
	}
	public String getName(){
		return name;
	}

	public int getRaffleNum(){
		return raffleNum;
	}
}

class Fibonnacci{
	int[] a;
	int correctNum;

	public Fibonnacci(){
		a = new int[20];
		a[0] = 0;
		a[1] = 1;
		correctNum = 2;

	}
	public void updateNum(int numIn){

		for(int i = 0; i<numIn;i++){
			a[i] = a[i - 1] + a[i - 2];
		}
		correctNum = numIn;
	}

	public void printSequence(){
		for (int n : a) {
			System.out.println(n);
		}
	}

}

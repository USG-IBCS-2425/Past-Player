import java.util.*;

class Sorting {

	public static void bubbleSort(ArrayList<Integer> a){
		for (int i = 0; i < a.size(); i++){
			for(int m = 0; m < a.size() - 1; m++){
				int current = a.get(m);
				int next = a.get(m+1);

				if (current>next){
					a.set(m,next);
					a.set(m+1,current);
				}

			}
		}

	}


	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		int n = 10;
		for (int i = 0; i < n; i++) {
			int newNum = 1 + (int)(Math.random()*n);
			a.add(newNum);
		}
		System.out.println(a);


		long start = System.nanoTime();

		bubbleSort(a);

		long end = System.nanoTime();
		long total = end - start;

		System.out.println(a);

        System.out.println("Bubble sort took " + total + " nanoseconds");


	}
}
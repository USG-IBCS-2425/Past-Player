class LoopArrayPractice{

	public static int middleValue(int[] intArr){
		int midVal = (intArr.length-1)/2;
		return intArr[midVal];
	}

	public static int numMatches(String[] strArr, String strIn){
		int num = 0;

		for(int i = 0; i<strArr.length; i++){
			if(strIn.equals(strArr[i])){
				num = num+1;
			}
		}
		return num;
	}

	public static boolean inOrder(int[] intArrOrder){
		boolean inOrder = false;
		for(int i = 0; i<intArrOrder.length-1; i++){
			if(intArrOrder[i]<intArrOrder[i+1]||intArrOrder[i]>intArrOrder[i+1]){
				inOrder = true;
			}
		}
		return inOrder;

	}
	public static boolean[] doubleLetter(String[] strArrWords){
		boolean[] check = new boolean[strArrWords.length];

		for(int i = 0; i<strArrWords.length;i++){
			String currentWord = strArrWords[i];
			check[i] = false;
			for(int a = 0; a<currentWord.length()-1;a++)
				if(currentWord.charAt(a)==currentWord.charAt(a+1)){
					check[i] = true;
				}
		}
		return check;
	}

	public static String[] bookEnds(String[] originalArr){
		String[] output;
		output = new String[originalArr.length];
		int validNum = 0;

		for(int i=0; i<originalArr.length; i++){
			String currentWord = originalArr[i];
			if(currentWord.charAt(0) == currentWord.charAt(currentWord.length())){
				validNum = validNum+1;
				for(int c =0; i<originalArr.length; i++){
					output[c] = currentWord;
				}

			}
			
		}
		return output;

	}
	public static void main(String[] args) {
		//1
		int[] intArr = {1,3,2,6,7};
		middleValue(intArr);
		System.out.println("Middle value is: " + middleValue(intArr));

		//2
		String[] strArr = {"Vera","Vera","dhsak"};
		String strIn = "Vera";
		System.out.println("Number of matches: " + numMatches(strArr,strIn));

		//3
		int[] intArrOrder = {2, 3, 8, 8, 9};
		System.out.println(inOrder(intArrOrder));

		//4
		String[] strArrWords = {"Considine", "Phillips", "Vankatesh", "Elliott", "Droubay", "Woolley"};
		boolean[] check = doubleLetter(strArrWords);
		for(boolean w:check){
			System.out.print(w + ", ");
		}

		//5
		String[] originalArr = {"bob", "jim", "sally", "anna", "joe", "elle", "zbhskdjez"};
		String[] output = bookEnds(originalArr);
		for(String s:output){
			System.out.print(s + ", ");
		}

	}
}






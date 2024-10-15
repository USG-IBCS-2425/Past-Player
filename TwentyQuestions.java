import java.util.*;

class TwentyQuestions{

	String[]possibleAnswers;
	ArrayList<String> currentPossibleAnswers;
	int questionsAsked;
	String lastQuestion;


	public TwentyQuestions(String[]inputPossibleAnswers){
		possibleAnswers = inputPossibleAnswers;
		currentPossibleAnswers = new ArrayList<String>();
		for(int i=0; i<possibleAnswers.length;i++){
			currentPossibleAnswers.add(inputPossibleAnswers[i]);
		}
		questionsAsked = 0;
		lastQuestion = "";

	}

	public String askQuestion(){
		questionsAsked++;
		if(questionsAsked == 1){
			lastQuestion = "Is it mammal?";

		}else if(questionsAsked == 2){
			if(currentPossibleAnswers.contains("Deer")){
				lastQuestion = "Is it commonly kept as pet?";
			}else{
				lastQuestion = "Does it live in water?";
			}

		}else if(questionsAsked == 3){
			if(currentPossibleAnswers.contains("Rabbit")){
				lastQuestion = "Is it a dog?";
			}else if(currentPossibleAnswers.contains("Deer")){
				lastQuestion = "Is it carnivore?";
			}else if(currentPossibleAnswers.contains("Sea Snake")){
				lastQuestion = "Is it reptile?";
			}else{
				lastQuestion = "Does it fly?";
			}


		}else if(questionsAsked == 4){

			if(currentPossibleAnswers.contains("Golden Retriever")){
				lastQuestion = "Is it big?";
			}else if(currentPossibleAnswers.contains("Rabbit")){
				lastQuestion = "Is it a cat?";
			}else{
				lastQuestion = "Is it large?";
			}

		}else if(questionsAsked == 5){
			if(currentPossibleAnswers.contains("Ragdoll")){
				lastQuestion = "Does it has long hair?";
			}else{
				lastQuestion = "Does it has long ears?";
			}
		}else{
			lastQuestion = "No more questions.";
		}
		return lastQuestion;
	}

	public void updateAnswers(String userInput){
		if(questionsAsked == 1){
			if(userInput.contains("yes")){
				currentPossibleAnswers.remove("Butterfly");
				currentPossibleAnswers.remove("Sea Snake");
				currentPossibleAnswers.remove("Duck");
				currentPossibleAnswers.remove("Shark");
			}else{
				currentPossibleAnswers.remove("Deer");
				currentPossibleAnswers.remove("Golden Retriever");
				currentPossibleAnswers.remove("Maltese Dog");
				currentPossibleAnswers.remove("Rabbit");
				currentPossibleAnswers.remove("Hamster");
				currentPossibleAnswers.remove("Fox");
				currentPossibleAnswers.remove("Puma");
				currentPossibleAnswers.remove("Ragdoll");
				currentPossibleAnswers.remove("American Shorthair");
			}
		}

		if(questionsAsked == 2){
			if(lastQuestion.contains("Is it commonly kept as pet?")){
				if(userInput.contains("yes")){
					currentPossibleAnswers.remove("Deer");
					currentPossibleAnswers.remove("Fox");
					currentPossibleAnswers.remove("Puma");
				}else{
					currentPossibleAnswers.remove("Rabbit");
					currentPossibleAnswers.remove("Golden Retriever");
					currentPossibleAnswers.remove("Maltese Dog");
					currentPossibleAnswers.remove("Hamster");
					currentPossibleAnswers.remove("Ragdoll");
					currentPossibleAnswers.remove("American Shorthair");
				}
			}else{
				if(userInput.contains("yes")){
					currentPossibleAnswers.remove("Butterfly");
					currentPossibleAnswers.remove("Duck");
				}else{
					currentPossibleAnswers.remove("Sea Snake");
					currentPossibleAnswers.remove("Shark");
				}
			}
		}
		if(questionsAsked == 3){

			if(lastQuestion.contains("Is it a dog?")){
				if(userInput.contains("yes")){
					currentPossibleAnswers.remove("Rabbit");
					currentPossibleAnswers.remove("Hamster");
					currentPossibleAnswers.remove("Ragdoll");
					currentPossibleAnswers.remove("American Shorthair");
				}else{
					currentPossibleAnswers.remove("Golden Retriever");
					currentPossibleAnswers.remove("Maltese Dog");
				}

			}else if(lastQuestion.contains("Is it carnivore?")){
				if(userInput.contains("yes")){
					currentPossibleAnswers.remove("Deer");
				}else{
					currentPossibleAnswers.remove("Fox");
					currentPossibleAnswers.remove("Puma");
				}

			}else if(lastQuestion.contains("Is it reptile?")){
				if(userInput.contains("yes")){
					currentPossibleAnswers.remove("Sea Snake");
				}else{
					currentPossibleAnswers.remove("Shark");
				}

			}else{
				if(userInput.contains("yes")){
					currentPossibleAnswers.remove("Duck");
				}else{
					currentPossibleAnswers.remove("Butterfly");
				}
			}
		}
		if(questionsAsked == 4){

			if(lastQuestion.contains("Is it big?")){
				if(userInput.contains("yes")){
					currentPossibleAnswers.remove("Maltese Dog");
				}else{
					currentPossibleAnswers.remove("Golden Retriever");
				}
			}else if(lastQuestion.contains("Is it a cat?")){
				if(userInput.contains("yes")){
					currentPossibleAnswers.remove("Hamster");
					currentPossibleAnswers.remove("Rabbit");
				}else{
					currentPossibleAnswers.remove("Ragdoll");
					currentPossibleAnswers.remove("American Shorthair");
				}

			}else{
				if(userInput.contains("yes")){
					currentPossibleAnswers.remove("Fox");
				}else{
					currentPossibleAnswers.remove("Puma");
				}
			}
		}


		if(questionsAsked == 5){

			if(lastQuestion.contains("Does it has long hair?")){
				if(userInput.contains("yes")){
					currentPossibleAnswers.remove("American Shorthair");
				}else{
					currentPossibleAnswers.remove("Ragdoll");
				}
			}else{
				if(userInput.contains("yes")){
					currentPossibleAnswers.remove("Hamster");
				}else{
					currentPossibleAnswers.remove("Rabbit");
				}
			}
		}
	}


	public String guess(){
		String answer = "";
		if(currentPossibleAnswers.size() == 1){
			answer = currentPossibleAnswers.get(0);
		}
		return answer;
	}



	public static void main(String[] args) {
		String[] inputPossibleAnswers = {"Deer","Golden Retriever","Maltese Dog","Rabbit","Hamster","Fox","Puma","Ragdoll","American Shorthair","Butterfly","Sea Snake","Duck","Shark"};
		TwentyQuestions t = new TwentyQuestions(inputPossibleAnswers);
		Scanner s = new Scanner(System.in);
		ArrayList<String> answers = new ArrayList<String>();

		while(true){
			String question = t.askQuestion();
			System.out.println(question);
			String userInput = s.nextLine();
			t.updateAnswers(userInput);
			if (t.currentPossibleAnswers.size() == 1) {
				break;
			}
		}
		String guess = t.guess();
		System.out.println("My guess is: " + guess);
	}

}
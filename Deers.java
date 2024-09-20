class Deers{


	int numberOfAnimals;
	String animals;

	public Deers(){
		animals = "";
		int numberOfAnimals = 0;
	}

	public void addAnimal(Deer deer){

		if(numberOfAnimals > 0){
			animals = animals + ", ";
		}

		animals = animals + deer.getName();
		numberOfAnimals = numberOfAnimals + 1;

	}



	public String getAnimals(){
		return animals;
	}

	public int getNumOfAnimals(){
		return numberOfAnimals;
	}

	public static void main(String[] args) {
		Deers deerEnclosure = new Deers();
		
		Deer d1 = new Deer("Lee", 2, "INFJ", "male");
		Deer d2 = new Deer("Bambi", 1, "ISFP", "female");
		Deer d3 = new Deer("Lulu", 3, "ENFP", "female");
		Deer d4 = new Deer("K", 4, "ESTJ", "male");
		

		deerEnclosure.addAnimal(d1);
		deerEnclosure.addAnimal(d2);
		deerEnclosure.addAnimal(d3);
		deerEnclosure.addAnimal(d4);


		System.out.println("Animals in the enclosure: " + deerEnclosure.getAnimals());
		System.out.println("Number of animals: " + deerEnclosure.getNumOfAnimals());
		
	}
}
enum Gender{MALE,FEMALE};
class Dog extends Animal{
	
	int age;
	
	
	Gender myGender = Gender.MALE;
	//Gender yourGender = Gender.FEMALE;
	public Dog(int dogsAge,Gender dogsgender){
		age = dogsAge;
		myGender = dogsgender;
	}
	
	public void bark(){
		System.out.println("Woof!");
		
		
	}
	public void run(int feet){
		System.out.println("Your dog ran "+ feet + " feet!");
		
		
	}
	public int getAge(){
		return age;
	}
	public Gender getGender(){
		return myGender;
		
	}
	
	public static void main(String[] args){
		Dog spike = new Dog(6,Gender.MALE);
		spike.bark();
		spike.run(70);
		int spikeAge = spike.getAge();
		Gender spikeGender = spike.getGender();
		System.out.println("You're dog is "+ spikeAge +" yrs old!");
		System.out.println("Your dog is " + spikeGender + "!");
		spike.checkStatus();
		spike.petSpicies();
		
		
	}



}
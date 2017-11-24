class Dog extends Animal{
	
	int age;
	// spike;
	//enum gender{MALE,FEMALE};
	public Dog(int dogsAge/*,string dogsgender*/){
		age = dogsAge;
		//gender = dogsgender;
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
	/*public string getGender(){
		return gender;
		
	}*/
	
	public static void main(String[] args){
		Dog spike = new Dog(6);
		spike.bark();
		spike.run(70);
		int spikeAge = spike.getAge();
		//string Gender = spike.getGender();
		System.out.println("You're dog is "+ spikeAge +" yrs old!");
		//System.out.println(spikeGender);
		spike.checkStatus();
		spike.petSpicies();
		
		
	}



}
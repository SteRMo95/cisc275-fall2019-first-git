class Dog extends Animal implements Comparable{

	Dog(String name, int legs) {
		super(legs, name);
	}
	
	public String toString() {
		return super.toString() + " (Dog)";
	}

	public int getLegs(){
		return super.getLegs();
	}
		
				
	@Override
	public int compareTo(Object other) {
		Dog otherDog = (Dog)other;
		int nameResult = this.name.compareTo(otherDog.name);
		if (nameResult != 0) {
			return nameResult;
		}
		else {
			return this.legs - otherDog.legs;
		}
															
	}
					
}

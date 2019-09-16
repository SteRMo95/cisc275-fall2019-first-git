class Animal{
	public int legs;
	public String name;
				
	Animal(int legs, String name){
		this.legs = legs;
		this.name = name;
	}

	public int getLegs(){
		return this.legs;
	}
					
	public int compareTo(Object other) {
		return 0;
	}

	public String toString() {
		return "" + name + " with " + legs + " legs";
	}
}

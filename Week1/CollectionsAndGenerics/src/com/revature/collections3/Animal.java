package com.revature.collections3;

public class Animal {
	
	String name;
	int age;
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// this is another method
	public void shoutName() {	
		String x = this.name;
		System.out.println("MY NAME IS " + x.toUpperCase());
	}
	
	// this is a method
	public int futureAge() {
		return this.age + 20;
	}
	
	public void choppedName() {
		// this method will use the String.substring() method to return a new name
		String x = this.name;
		System.out.println(x.substring(2));
	}
	
	public String anotherNameMethod() {
		String x = this.name;
		return x.substring(2,4);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	

}

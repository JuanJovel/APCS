package com.e;

public class E10_3 {
	public static void main(String[] args) {
		Person jason = new Person("Jason", 5.11);
		Person sami = new Person ("Sami", 6);
		Person dominic = new Person ("Dominic", 5.5);
		Measurable [] persons = {jason, sami, dominic};
		
		System.out.println("Average Height: "+Data.average(persons));
		System.out.println("Tallest person: "+((Person) Data.max(persons)).getName());
		
	}

	public static class Person implements Measurable{
		String name;
		double height;
		
		public Person (String name, double height) {
			this.name = name;
			this.height = height;
		}
		
		public String getName() {
			return this.name;
		}
		
		public double getMeasure() {
			return this.height;
		}
	}
	
	public static interface Measurable {
		double getMeasure();
	}
	
	public static class Data {
		public static double average (Measurable[] objects) {
			double sum = 0;
			
			for (Measurable p : objects) {
				sum  += p.getMeasure();
			}
			
			return sum/objects.length;
		}
		
		public static Measurable max (Measurable[] objects) {
			Measurable max = objects[0];
			for (Measurable p : objects) {
				if (max.getMeasure() < p.getMeasure()) {
					max = p;
				}
			}
			return max;
			
		}
	}
	

}




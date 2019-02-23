package com.P;

public class P10_2 {

	public static void main(String[] args) {
		PrimeSequence sequence = new PrimeSequence();
		for(int x = 0; x < 11; x++) {
			System.out.println(sequence.next());
		}

	}
	
	public static class PrimeSequence implements Sequence {
		int prime = 1;
		@Override
		public int next() {
			while(prime%2 == 1) {
				prime++;
			}
			prime++;
			return prime;
		}
		
	}
	
	public static interface Sequence{
		int next();
	}

}

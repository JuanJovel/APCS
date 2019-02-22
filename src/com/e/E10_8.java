package com.e;

import java.util.concurrent.TimeUnit;

public class E10_8 {

	public static void main(String[] args) {
		String [] arr = {"short", "long string", "medium"};
		StringMeasurer measure = new StringMeasurer();
		System.out.println("Strings to be tested...");
		for (String p : arr) {
			System.out.println("\t"+p);
		}
		System.out.println();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Longest String: " + Data1.max(arr, measure));
		}

	
	public static class Data1 {
		public static double average (Object[] objects, Measurer m) {
			double sum = 0;
			
			for (Object p : objects) {
				sum  += m.measure(p);
			}
			
			return sum/objects.length;
		}
		
		public static Object max (Object[] objects, Measurer m) {
			Object max = objects[0];
			for (Object p : objects) {
				if (m.measure(max) < m.measure(p)) {
					max = p;
				}
			}
			return max;
			
		}
	}
	
	interface Measurer {
		double measure(Object obj);
	}
	
	public static class StringMeasurer implements Measurer {

		@Override
		public double measure(Object obj) {
			String string = (String)(obj);
			int length = string.length();
			return (double)(length);
		}
		
	}
}
	

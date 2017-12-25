package com.infotech.client;

public class ClientTest {

	public static void main(String[] args) {

		int sum1 = sum("Calculated Sum:");
		System.out.println(sum1);
		
		System.out.println("------------------------");
		int sum2 = sum("Calculated Sum:",new int[]{4,5,1,10});
		System.out.println(sum2);
	} 
	
	private static int sum(String message,int ...arr){
	
		System.out.println(message);
		int sum = 0;
		for (int num : arr) {
			sum = sum+num;
		}
		return sum;
	}
}

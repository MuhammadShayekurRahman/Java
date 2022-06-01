package com.qa.restaurant;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Staff staff = new Staff();
		System.out.println(staff);
		
//		Staff staff1 = new Staff(1, "lil", "Durk", "Manager", 25000);
//		System.out.println(staff1);
		
		System.out.println("How many staff would you like to add:");
		int q = scanner.nextInt();
		
		if (q>0) {
			for (int i=1;i<q+1;i++) {
			
				staff.newStaff(i);
			}
		}else {
			System.out.println("Please Enter at least 1");
		}
		
	}

}

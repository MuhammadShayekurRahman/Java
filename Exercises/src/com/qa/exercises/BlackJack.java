package com.qa.exercises;

public class BlackJack {
	public void play(int x, int y) {
		if (x>0 && y>0) {
			if (x>21 || y>21) {
				System.out.println(0);
			}else {
				
				if (x>=y) {
					System.out.println(x);
				} else {
					System.out.println(y);
				}
				
			}
		}
		else {
			System.out.println("Please enter values greather than 0");
		}
	}
}

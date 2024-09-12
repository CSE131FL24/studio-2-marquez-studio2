package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub

	
		
	System.out.println("How much money are you starting with?");
	double money = in.nextDouble();
	
	System.out.println("What is the probability that you win?");
	double winChance = in.nextDouble();
	
	System.out.println("How much money would make you leave (i.e., what is your win limit?");
	double winLimit = in.nextDouble();
	
	
	System.out.println(
	int totalSimulations;
	
	if 
	
	
	while  (money > 0 && money <= winLimit)	{
		
		double outcome = Math.random();
		
		if (outcome <= winChance) {
		System.out.println(money);
		money++;
		}
			else {
			System.out.println(money);
			money--;
			}
		
		
	}
	
	
	}

}

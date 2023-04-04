package com.paymoney.transaction;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfArray;
		int target;
	
		System.out.println("enter the size of transaction array");
		sizeOfArray = sc.nextInt();
		int array[] = new int[sizeOfArray];
		System.out.println("enter the values of array");
		for(int i = 0; i<sizeOfArray; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		target = sc.nextInt();
		while(target-- != 0) {
			int flag = 0;
			long targetVal;
			System.out.println("enter the value of target");
			targetVal = sc.nextInt();
			long sum = 0;
			for(int i = 0; i < sizeOfArray; i++) {
				sum += array[i];
					if (sum >= targetVal) {
						System.out.println("Target achieved after "+(i + 1) + " transactions \n");
						flag = 1;
						break;
					}
				}
			
			if (flag == 0) {
				System.out.println("Given target is not achieved ");
			}
		}

	}

}

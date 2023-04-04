package com.traveller.payment;

import java.util.Scanner;

import com.traveller.service.BubbleSortImplement;
import com.traveller.service.NotesCount;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BubbleSortImplement bubbleSort = new BubbleSortImplement();
		NotesCount notesCount = new NotesCount();
		
		System.out.println("enter the size of currency denominations");
		int size = sc.nextInt();
		int notes[] = new int[size];
		System.out.println("enter the currency denominations value");
		for(int i = 0; i<size; i++) {
			notes[i] = sc.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		bubbleSort.bubbleSort(notes);
		notesCount.notesCountImplementation(notes, amount);
	}

}

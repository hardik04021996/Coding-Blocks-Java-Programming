package assignment4;

import java.util.Scanner;

public class assign4q5 {
	public static String[] takeInput(int size) {
		Scanner s = new Scanner(System.in);
		String[] input = new String[size];
		for (int i = 0; i < size; i++) {
			input[i] = s.next();
		}
		return input;
	}

	public static String[] sort(String[] input) {
		String temp = "";
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length - i - 1; j++) {
				if (input[j].length() > input[j + 1].length()) {
					temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		return input;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = s.nextInt();
		String[] input = takeInput(size);
		String[] output = sort(input);
		for(int i=0; i<output.length; i++){
			System.out.print(output[i]+" ");
		}
	}
}

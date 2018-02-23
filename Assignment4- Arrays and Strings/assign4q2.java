package assignment4;

import java.util.Scanner;

public class assign4q2 {
	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = s.nextInt();
		int input[] = new int[size];

		System.out.print("enter the elements of array: ");
		for (int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void find(int[] input) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter x:");
		int x = s.nextInt();
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				for (int k = j + 1; k < input.length; k++) {
					if (x == input[i] + input[j] + input[k]) {
						System.out.println(input[i] + " at index " + i + " , " + input[j] + " at index " + j + " and "
								+ input[k] + " at index " + k + " is a triplet.");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] input = takeinput();
		find(input);
	}

}

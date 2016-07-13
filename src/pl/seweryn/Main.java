package pl.seweryn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text;

		System.out.println("Task 1, please write String: ");
		text = in.nextLine(); // string input
		System.out.println("Your first non-repeat letter in your string is: " + Task1.FindNonRepChar(text));

		in.close();
	}

}

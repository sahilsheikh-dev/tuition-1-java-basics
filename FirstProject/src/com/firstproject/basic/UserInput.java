package com.firstproject.basic;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

//		Class object_name = new Class(value);

		Scanner scan = new Scanner(System.in);

		byte age = scan.nextByte();
		System.out.println("My Age is " + age);

		short carNumber = scan.nextShort();
		System.out.println("My car number is " + carNumber);

		String name = scan.nextLine();
		name = scan.nextLine();
		System.out.println("My name is " + name);

		long number = scan.nextLong();
		System.out.println("My number is " + number);

		scan.close();
		
	}

}

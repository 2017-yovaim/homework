package edu.school.problems;

import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Date d1 = new Date();
		Date d2 = new Date(0, 0, 13, 14, 10, 2020);
		Date d3 = new Date();
		
		System.out.println("d1 = " + d1.toString());
		System.out.println("d2 = " + d2.toString());
		
		int comparison = d3.compareTo(d1);
		System.out.println(comparison);
		
		d3.setSeconds(20);
		d3.setMinutes(3);
		d3.setHour(20);
		d3.setMonth(3);
		d3.setDay(20, d3.getMonth());
		d3.setYear(2020);
		
		System.out.println("d3 = " + d3.toString());
		
		int dayYear = d3.dayInTheYear();
		System.out.println(dayYear);
		
		int weekYear = d2.weekInTheYear();
		System.out.println(weekYear);
		
		System.out.println("Enter the number of elements in your array.");
		int n = input.nextInt();
		
		Date[] arr = new Date[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the seconds of your date.");
			arr[i].setSeconds(input.nextInt());
			System.out.println("Enter the minutes. of your date.");
			arr[i].setMinutes(input.nextInt());
			System.out.println("Enter the hour of your date.");
			arr[i].setHour(input.nextInt());
			System.out.println("Enter the month of your date.");
			arr[i].setMonth(input.nextInt());
			System.out.println("Enter the day of your date.");
			arr[i].setDay(input.nextInt(), arr[i].getMonth());
			System.out.println("Enter the year of your date.");
			arr[i].setYear(input.nextInt());
		}
		
		input.close();
		
		sortDate(arr);
		
		System.out.println("Your sorted array is:");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void sortDate(Date[] d) {
		Date temp = new Date();
		for(int i = 0; i < d.length; i++) {
			for(int j = 0; j < d.length - 1; j++) {
				if(d[j].compareTo(d[j + 1]) == 1) {
					temp = d[j + 1];
					d[j + 1] = d[j];
					d[j] = temp;
				}
			}
		}
	}

}

package cis245homework1;

import java.util.Scanner;

public class Arrayhw1pr1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 
		 System.out.print("Enter the number of elements ");
		 int num = input.nextInt();
		 
		 int[] list1 = new int[num];
		 int[] list2 = new int[num];
		 
		 System.out.println("Enter numbers for list 1");
		 System.out.println("-------------------------");
		 for (int i = 0; i < list1.length; i++) {
			 System.out.print("Enter number " + (i+1) + " : ");
			 list1[i] = input.nextInt();
		 }
			 
		 System.out.println("Enter numbers for list 2");
		 System.out.println("------------------------");
		 for (int i = 0; i < list2.length; i++) {
			 System.out.print("Enter number " + (i+1) + " : ");
			 list2[i] = input.nextInt();
			 
		 }
		 System.out.println("List 1 ----------------");
		 display(list1);
		 System.out.println("List 2 ----------------");
		 display(list2);
		 
		 System.out.println("\n----------------");
		 if (equals(list1, list2)) {
			 System.out.println("Lists are Identical");
		 } 
		 else {
			 System.out.println("Lists are not Identical");
		 }
		
	}// end of main

	public static void display(int[] list) {
		for (int i=0; i < list.length; i++)
			System.out.println("List 1 " + list + " : " + list[i]);
			
		}
	
	public static boolean equals(int[] list1, int[] list2) {
			if (list1.length != list2.length) {
				return false;
			}
			
			for (int i = 0; i < list1.length; i++) {
				if(list1[i] != list2[i]) {
					return false;
				}
			}
			return true;
		
			

	}

}

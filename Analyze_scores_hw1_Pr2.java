package cis245homework1;

import java.util.Scanner;

public class Analyze_scores_hw1_Pr2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] scores = new int[100];
		
		for (int i = 0; i <scores.length; i++) {
			scores[i] = (int)(Math.random()*101);
		}
		System.out.println("Generate Scores: ");
		displayScores(scores);
		
		int aboveEqual = countAboveOrEqualAverage(scores);
		System.out.println("\nNumber of scores above or equal to average " + aboveEqual);
	

	}
	public static void displayScores(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%3d ", scores[i]);
			if((i+1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	public static int countAboveOrEqualAverage(int[] scores) {
		double sum = 0;
		for (int score : scores) {
			sum += score;
		}
		double average = sum / scores.length;
		System.out.printf("\nThe average is: %.2f", average);
		
		int count = 0; 
		for (int score : scores) {
			if (score >= average) {
				count++;
			}
		}
		return count;
	}

}

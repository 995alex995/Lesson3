package exercises;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class HighLowGame {

public static void main(String[] args) {
	Random random = new Random();
	int num = random.nextInt(20);
	int NoT=0;
	Scanner scanner = new Scanner(System.in);
	int Guess;
	boolean win = false;
	System.out.println("Guess the number between 1 and 20");
	while (win ==false) {
		
		Guess = scanner.nextInt();
		NoT++;
		
		if (Guess == num) {win = true;
			}
		else if (Guess > num) {System.out.println("Try for a lower number..");}
		else if (Guess < num) {System.out.println("Try for a higher number..");}
			
		}
	System.out.println("You win");
		}
	}
	
	
	
	
	
	



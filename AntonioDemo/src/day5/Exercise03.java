package day5;
import java.util.Scanner;
import java.util.Random;

public class Exercise03 {
	private static final int NUM_ROCK = 1;
	private static final int NUM_PAPER = 2;
	private static final int NUM_SCISSORS = 3;
	private static final int NUM_ROUND = 1;
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int numGame;
		do {
			System.out.println("Please choose: 1-rock 2-paper 3-scissors");
			int numUser = scan.nextInt();
			System.out.println("User chose " + name(numUser));
			int numComputer = random.nextInt(1, 4);
			System.out.println("Computer chose " + name(numComputer));
			if (numUser == numComputer) {
				System.out.println("It´s a tie");
			} else {
				if (numUser == NUM_ROCK) {
					if (numComputer == NUM_PAPER) {
						System.out.println("Computer wins");
					} else {
						System.out.println("User wins");
					}
				} else if (numUser == NUM_PAPER) {
					if (numComputer == NUM_SCISSORS) {
						System.out.println("Computer wins");
					} else {
						System.out.println("User wins");
					}
				} else {
					if (numComputer == NUM_ROCK) {
						System.out.println("Computer wins");
					} else {
						System.out.println("User wins");
					}
				}
			}
			
			System.out.println("Want to play one more round? 1-yes other-no");
			numGame = scan.nextInt();
			
		} while(numGame == NUM_ROUND);
	}
	
	private static String name(int num) {
		
		String object;
		if (num == NUM_ROCK) {
			object = "rock";
		} else if (num == NUM_PAPER) {
			object = "paper";
		} else {
			object = "scissors";
		}
		return object;
	}	
}

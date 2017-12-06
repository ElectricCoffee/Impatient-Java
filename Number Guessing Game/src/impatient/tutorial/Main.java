package impatient.tutorial;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean running = true;
		Guesser guesser = new Guesser(1, 100);
		Scanner scanner = new Scanner(System.in);
		
		while (running) {
			System.out.format("I'm guessing your number is %d\n", guesser.guess());
			
			String response = scanner.nextLine();
			
			switch (response) {
			case "higher":
				guesser.higher();
				break;
			case "lower":
				guesser.lower();
				break;
			case "correct":
				System.out.println("Sweet! I'm good at this game!");
			case "exit":
				running = false;
				break;
			default:
				System.out.println("I don't understand!");
				break;
			}
		}
		
		scanner.close();
		System.out.println("Let's play again sometime.");
	}
}

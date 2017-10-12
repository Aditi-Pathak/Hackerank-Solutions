package hackerank;

import java.util.LinkedList;
import java.util.Scanner;

public class SolutionPalindrome 
{
	LinkedList<Character> stack = new LinkedList<Character>();
	LinkedList<Character> queue = new LinkedList<Character>();
	
	void enqueueCharacter(char c) {
		queue.addLast(c);
	}

	void pushCharacter(char c) {
		stack.addLast(c);
	}


	char popCharacter() {
		return stack.getLast();
	}

	char dequeueCharacter() {
		return queue.get(0);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		SolutionPalindrome p = new SolutionPalindrome();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length/2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;                
				break;
			}
		}

		//Finally, print whether string s is palindrome or not.
		System.out.println( "The word, " + input + ", is " 
				+ ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}
}


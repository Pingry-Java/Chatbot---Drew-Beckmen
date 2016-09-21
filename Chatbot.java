import java.util.Scanner;

/**
	* This class represents a basic AI that will chat with a human user.
	* It isn't very human-like. At least not yet
	* @author Drew Beckmen
	* @version 0.1
*/

public class Chatbot

{
	public static void main(String[] args)
	{
		System.out.println("Hello, I'm Chatbot. What is your name?");
		
		//System.in is a standard input (keyboard) System.out is standard output (monitor)
		
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		
		System.out.println("Nice to meet you " + name + ", how old are you?");
		int age = keyboard.nextInt(); //Leaves the pointer before the newline character
		keyboard.nextLine(); //Gets pointer to the beginning of the next line.
		
		if (age > 40 && age < 100)
		{
			System.out.println("Wow, that's old.");
			System.out.println("Only " + (100 - age) + " years until you're 100!");
		}
		else
		{
			//This is changing the value of age by one. If it was 28, now 29
			System.out.println("How long until you turn " + (++age) + "?");
			keyboard.nextLine(); //No plans to use answer so don't store it anywhere
		}
		
		String answer = "anything but bye to enter the loop";
		while (!(answer.equals("bye")|| answer.equals("Bye")))
		{
			System.out.println("Tell me one of your hobbies (or say \"bye\" to exit)"); //Escape sequence. Backslash
			answer = keyboard.nextLine();
		}
	}



}
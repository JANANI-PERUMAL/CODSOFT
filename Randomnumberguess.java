package cs;
import java.util.Scanner;
import java.util.Random;

public class Randomnumberguess
{
	static int n;
	static int max_attempts;
	static int rounds;
	static int total =0;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Random guess game ");
		Scanner sn = new Scanner(System.in);
		System.out.println("enter the maximum range: ");
		n = sn.nextInt();
		System.out.println("enter the number of attempts per round");
		max_attempts = sn.nextInt();
		System.out.println("enter the number of rounds:");
		rounds = sn.nextInt();
		for(int i=1;i<=rounds;i++)
		{
			Random r = new Random();
			int rand_number = r.nextInt(n)+1;
			int attempts =0;
			System.out.println("round " + i + " :Guess the number between 1 and " + n);
			System.out.println("You have " +  max_attempts + " attempts.");
			while(attempts<max_attempts)
			{
				System.out.println("enter your guess : ");
				int guess = sn.nextInt();
				attempts++;
				
				if(guess == rand_number)
				{
					System.out.println("Congrats! You gussed the correct number: " + guess);
					int score = max_attempts-attempts;
					total += score;
					System.out.println("you earned " + score + " points this round ");
					System.out.println("Total score is now: " + total);
					break;
				}
				else if(guess > rand_number)
				{
					System.out.println("too high! try a smaller number. ");
				}
				else
				{
					System.out.println("too low! try a larger number. ");
				}
				if(attempts == max_attempts)
				{
					System.out.println("no attempts left. the correct number is " + rand_number);
				}
				else
				{
					System.out.println("attempts remianing: " +(max_attempts - attempts));
				}
			}
		}
		System.out.println("game over ! your total score is " + total);
		
	
	
	
	
	}

}

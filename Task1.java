import java.util.*;
public class Task1
{
	static int MIN_RANGE=1;
    static int MAX_RANGE=100;
	static int MAX_ATTAMPTS=7;
	static int MAX_ROUNDS=3;
	static int guess_number=0;
	public static void main(String ar[])
	{
		int Totalscore=0;
		int roundscore=10;
		int attempts=1;
		int maxScore=roundscore-(Math.min(attempts,3)*2);
     	int remain_round=MAX_ROUNDS;
		System.out.println();
	    System.out.println("Welcome to the number guessing game ! Here,you'll have the opportunity to play a game where you guess a number and see if you can guess it correctly within the given range. Good Luck !");
		for(int i=1 ; i<=MAX_ROUNDS; i++)
		{
			int score=0;
			long random=Math.round(Math.random()*99)+1;
		    System.out.println();
		    System.out.println("Total Number of Remaining Rounds :"+(remain_round));
		    System.out.println("Total Number of Attempts : 7");
		    System.out.println();
	        for( attempts=1;attempts<=MAX_ATTAMPTS;attempts++)
			{	
		        System.out.println("Enter your guess number");
	         	Scanner sc=new Scanner(System.in);
		        guess_number=sc.nextInt();
	            if(random==guess_number)
				{					
                    score=roundscore-(Math.min(attempts,3)*2);
		            System.out.println("Congratulation! you guessed the number correctly ");
                    break ;		  
				}
	            else if(random>guess_number)
				{
		            System.out.println("Input Number is smaller then origional no.");
				}
				else
				{
		            System.out.println("Input Number is greater then origional no.");
				}
                System.out.println();
				
			}
		System.out.println("Round Score:"+(score));
		if(guess_number!=random)
		{
			System.out.println("Ready for Next Round , Random Number was="+(random));
			System.out.println();
		}
		remain_round--;
		Totalscore=Totalscore+score;
		
        if(remain_round==0)
		{
	        System.out.println("Total Score = "+(Totalscore)+" out of 24");
	        System.out.println("Nice try...");
	        System.out.println("Game Over...");
         	System.out.println("Play Again ?");
		}
		}
        System.out.println();
	}
}

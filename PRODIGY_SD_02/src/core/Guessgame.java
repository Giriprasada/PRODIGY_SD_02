package core;
import java.util.Scanner;
import java.util.Random;

public class Guessgame{

public static void main(String[] args){

boolean guesscorrect=false;

System.out.println("Guess the Number Challenge.....");
System.out.println("Enter the Number you Guess");
	

	Scanner sc=new Scanner(System.in);

	Random r = new Random();
	int randomNumber = r.nextInt(100) + 1; 
	int attempt=0;
        while(guesscorrect==false){

System.out.println("Enter your Guess and your guess should be in 1-100 range");
	
	int guessNumber=sc.nextInt();
	attempt++;
	if(guessNumber>100)
	{
		System.out.println(" your guess is morethan 100 please Enter the Number between 1 and 100 /n/n");
		attempt=0;
	}

	else if(randomNumber>guessNumber)
	{
		System.out.println("The Number you Guessed is low");
	}
	else if(randomNumber<guessNumber)
	{
		System.out.println("The Number you Guessed is High");
	}
	else
	{
		guesscorrect = true;
		System.out.println("YOU WIN !!!!!!!!!!!!!");
		System.out.println("The Number you have guessed is" +guessNumber +" it is correct in  "+attempt+" attempts taken" );
	}
}
sc.close();
}
}
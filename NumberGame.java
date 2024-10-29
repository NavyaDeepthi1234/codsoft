import java.util.*;
public class NumberGame {

	//main method
	public static void main(String[] args) {
		int random,guess=1-100,attempt;
		System.out.println("\t_Number Guessing Game_");
		//Generating Random Numbers
		Scanner Keyboard=new Scanner(System.in);
		Random generator=new Random();
		random=generator.nextInt(100)+1;
		attempt = 1;
		System.out.println("\n I am thinking of a number between 0 and 100,what do you think it is \n");
				 	//input for guessing a random numbers
				 System.out.println("guess the number:");
				 while(guess != random) {
					 guess =Keyboard.nextInt();
					 if(guess >  random) {
						 System.out.println("Wrong guess,it's Lower then the number choose by me:");
						 System.out.println("guess again:");
						 attempt+=1;
						 
					 }
					 else if(guess<random) {
						 System.out.println("wrong guess,it's higher then the number choosen by me:");
						 System.out.println("guess again:");
						 attempt+=1;
					 }
					 else {
						 System.out.println(random +"is the correct answer");
						 attempt+=1;
						 System.out.println("\n"+random +"is guessed by the user in"+attempt 
								 +"\n\n\t_congratulations!! champion_");
					 }
				 }
						
	}

}

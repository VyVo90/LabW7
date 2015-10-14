import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		int rand, usernumb, loopnumb = 1;
		String B = "Too Big!!!";
		String S = "Too Small!!!";
		String user;
		String message;
		
		Scanner input = new Scanner(System.in);
		
		while(loopnumb<=3){
			
			System.out.print("Guess a number from 1 and 10, ");
			
		rand = 1 + (int)(Math.random()*10);
		
		usernumb = input.nextInt();
		
		if(usernumb >10 || usernumb < 1){
			System.out.printf("The number is out of the valid range!", usernumb);
		}
		else{
				loopnumb++;
				
		if(usernumb==rand)
			System.out.printf("Congrats, your guess is correct \n.");
		else{
			message = (usernumb > rand)? B:S;
			System.out.printf("%s\n The correct number is %d.\n", message, rand);
		}
		}
		}
	}

}

package magic8Ball;
import java.util.Random;
import java.util.Scanner;
public class Magic8 {
	public static void main(String[] args) {
		Scanner keybrd = new Scanner(System.in);
		System.out.println("What is your question?");
		String question = keybrd.nextLine();
		String[] answers = {"yes","no","maybe","never","I see this to be true","Ask me when im in a better mood"};
		int random= (int)(Math.random()*6);	
		System.out.println(answers[random]);
	} 
}

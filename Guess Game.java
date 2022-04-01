import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	game();
	}
public static void game() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your name");
	String name = sc.nextLine();
	System.out.println("Hello "+ name );
	System.out.println("Welcome to the Game");
	System.out.println("Shall we start the game");
	System.out.println("\t1. Yes");
	System.out.println("\t2. No");
	int begin = sc.nextInt();
	try {
	while(begin != 1) {
		System.out.println("Shall we start the game");
		System.out.println("\t1. Yes");
		System.out.println("\t2. No");
		begin = sc.nextInt();
	}
	Random random = new Random();
	int x = random.nextInt(10)+1;
	System.out.println("Please guess the number in between 1 to 10");
	int userinput = sc.nextInt();
	int times = 0;
	boolean finish = false;
	boolean hasWon = false;
	while(!finish) {
		times++;
	if(times < 6) {
	if(userinput == x) {
		hasWon = true;
	}
	else if(userinput > x){
		System.out.println("Guess lower number");
		userinput = sc.nextInt();
	}
	else {
		System.out.println("Guess higher");
		userinput = sc.nextInt();
	}}
	else {
		finish = true;
	}}
	if(hasWon) {
		System.out.println("Congrats you have guessed the right number");
	}
	else {
		System.out.println("Sorry "+name+" You have lost the game the correct number is "+x);
	}}
	catch(Exception e) {
		System.out.println("You have to enter only numbers");
		game();
	}
}
}

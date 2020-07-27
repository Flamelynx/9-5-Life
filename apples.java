import java.util.Scanner;
import java.util.Random;

public class apples {
	public static void main(String args[]) {
		boolean working = false;
		boolean onBreak = false;
		Scanner fQuestion = new Scanner(System.in);
		if (working == false) {
			System.out.println("Clock in?");

			String inorout = fQuestion.next();
			if (inorout.toUpperCase().equals("YES")) {

				working = true;
				Clockin();
			} else {
				System.out.println("Ok, goodbye!");
				System.exit(0);
			}
		}
		
		while (working == true) {
			question(working);
		}
		
	}

	public static void Clockin() {
		Scanner bucky = new Scanner(System.in);

		System.out.println("What hour is it?");
		int h = bucky.nextInt();
		System.out.println("What minute is it?");
		int m = bucky.nextInt();
		System.out.println("What seconds is it?");
		int s = bucky.nextInt();

		tuna tunaObject = new tuna();
		// System.out.println(tunaObject.toMilitary());

		tunaObject.setTime(h, m, s);
		System.out.println("You clocked in at " + tunaObject.toMilitary());

	}

	public static void Break() {
		Scanner breakTime = new Scanner(System.in);

		System.out.println("What hour is it?");
		int h = breakTime.nextInt();
		System.out.println("What minute is it?");
		int m = breakTime.nextInt();
		System.out.println("What seconds is it?");
		int s = breakTime.nextInt();

		tuna tunaObject = new tuna();
		// System.out.println(tunaObject.toMilitary());

		tunaObject.setTime(h, m, s);
		System.out.println("You started your break at " + tunaObject.toMilitary());
		if (m < 30) {
			m = m + 30;

		} else {
			h = h + 1;
			m = m - 30;

		}
		tunaObject.setTime(h, m, s);

		System.out.println("Your break is done now that it is " + tunaObject.toMilitary());

	}
	
	public static void question(boolean working) {
		System.out.println("Punch out for Break or Clock Out?");
		Scanner sQuestion = new Scanner(System.in);
		String inorout1 = sQuestion.next();
		
		if (inorout1.toUpperCase().equals("BREAK")) {
			Break();
		}
		else if (inorout1.toUpperCase().equals("OUT")) {

			working = false;
			clockOut();
		} else {
			System.out.println("Ok, back to work!");
			System.exit(0);
		}
		
		
	
	}
	
	public static void clockOut() {
		Scanner clockingOutTime = new Scanner(System.in);

		System.out.println("What hour is it?");
		int h = clockingOutTime.nextInt();
		System.out.println("What minute is it?");
		int m = clockingOutTime.nextInt();
		System.out.println("What seconds is it?");
		int s = clockingOutTime.nextInt();

		tuna tunaObject = new tuna();
		// System.out.println(tunaObject.toMilitary());

		tunaObject.setTime(h, m, s);
		System.out.println("You clocked out at " + tunaObject.toMilitary());
		
		System.exit(0);
		
	}
	
	}

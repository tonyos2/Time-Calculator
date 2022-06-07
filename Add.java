import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a time (no colon) :");
		int time = in.nextInt();
		
		System.out.println("Please enter the addition:");
		int add = in.nextInt();

		int hour = time/100 + add/100; //calculate hours individually
		int min = time%100 + add%100; //calculate minutes individually
		
		if (min > 60) { //if sum of minutes exceed 60, convert to hour
			hour++;
			min -= 60;
		}
		
		String s = (min < 10) ? ":0" : ":" ; //fixes issue of printing time such as 12:4
	
		System.out.println("The time entered was " + time);
		System.out.println("The time added was " + add);
		System.out.println("The time is now " + hour + s + min);
		
		in.close();
	}
}
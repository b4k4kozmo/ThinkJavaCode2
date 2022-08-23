
public class Time {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		int hour, minute, second;
		
		hour = 14;
		minute = 21;
		second = 59;
		//changed variables to double to calculate percentage
		double secondsPassed = (hour * 60.0 + minute) * 60.0 + second;
		double secondsPerDay = (24.0 * 60.0) * 60.0;
		double secRemaining = secondsPerDay - secondsPassed;
		double percentPassed = (secondsPassed / secondsPerDay)*100;
		
		
		System.out.println(secondsPassed+" seconds have passed since midnight.");
		System.out.println("There are "+secRemaining+" seconds left in the day" );
		System.out.println(percentPassed+"% of the day is left");
		
		//reused the variables hours, minute and second and created a new variable to subtract the original data from
		hour = 14;
		minute = 54;
		second = 59;
		double currentSecPassed = (hour * 60.0 + minute) * 60.0 + second;
		System.out.println(currentSecPassed - secondsPassed +" seconds have gone by since starting this exercise");
	}

}

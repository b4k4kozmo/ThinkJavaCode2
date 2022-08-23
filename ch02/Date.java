
public class Date {
public static void main(String[] args) {
//	System.out.println("hello world");
	String day, month, us, uk;
	int date, year;
	
	us = "American format: ";
	uk = "European format: ";
	
	day = "Tuesday";
	month = "August";
	date = 23;
	year = 2022;
	
	System.out.println(us+day+", "+month+" "+date+", "+year);
	System.out.println(uk+day+" "+date+" "+month+" "+year);
	
}

}

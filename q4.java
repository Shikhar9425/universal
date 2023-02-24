import java.util.*;
class q4{
	public static void main(String[] args){
		System.out.println("Enter number of days");
		Scanner sc = new Scanner(System.in);

		int days = sc.nextInt(); /// 1000 y = 2 // 
		int years = days/365;
		int month = days;
		//int month = (days - years*365)/30;
		int d = days - years*365 - month*30;
		System.out.println("days are"+days);
		System.out.println("years are"+years);
		System.out.println("month are"+month);
		System.out.println("days are"+d);

	}
}
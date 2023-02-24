import java.util.Scanner;
class q3{
	public static void main(String[] arr){
		System.out.println("Enter the value of p,r and t ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sim = a*b*c/100;
		//int per = sum*100/300;

		System.out.println("simple interest is "+sim);
		//System.out.println("Percentage is "+per);

	}
}
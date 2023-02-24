import java.util.*;
class qb1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int a = sc.nextInt();
		int sum = 0;
		int r;
		while(a>0){
			r = a%10;
			sum = sum*10 + r;
			a = a/10; 
		}
		System.out.println("reversed number is  "+sum);

	}
}
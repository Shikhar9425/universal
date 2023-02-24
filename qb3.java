import java.util.*;
class qb3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary ");
		float n = sc.nextFloat();
		if(n<1500){
		float hra = n/10;
		float da = 9*n/10;
		float sum = n + hra +da;
		System.out.println("hra is "+hra);
		System.out.println("da is "+da);
		System.out.println("Total salary is "+sum);}
		else{
			float hra = 500;
		float da = 98*n/100;
		float sum = n + hra +da;
		System.out.println("hra is "+hra);
		System.out.println("da is "+da);
		System.out.println("Total salary is "+sum);

		}}}
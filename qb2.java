import java.util.*;
class qb2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year ");
		int n = sc.nextInt();
		if(n%400 == 0){
			System.out.println("Y");
		}else if(n%100 == 0){
			System.out.println("N");
		}else if(n%4 == 0) {
			
				System.out.println("Y");
		}else{
			System.out.println("N");
		}
				
			
	}}
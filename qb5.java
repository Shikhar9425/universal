import java.util.*;
class qb5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = 2;
		int b = 1;
		int c;
		System.out.println(a+" "+b+" ");
		for(int i=1;i<10;i++){
			c = a+b; // 2 1 3 
			System.out.print(c+" ");
			a = b;
			b = c;
		}
}}
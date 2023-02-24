class q7{
	public static void main(String[] args){
		int a = 5;
		int b = 1;
		System.out.println("Before swap "+a+" "+b);
		int x;
		x = a;  // x = 5 x  5  1 
		a = b;
		b = x;
		System.out.println("After swap  "+a+" "+b);

	}
}
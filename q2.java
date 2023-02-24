class q2{
	public static void main(String[] arr){
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		int sum = a+b+c;
		int per = sum*100/300;

		System.out.println("Sum is "+sum);
		System.out.println("Percentage is "+per);

	}
}
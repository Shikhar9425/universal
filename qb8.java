import java.util.*;
class qb8{
	float init(){
			System.out.println(" Enter radius");
			Scanner sc = new Scanner(System.in);
			float r = sc.nextInt();
			return r; 

	}
	double calc(float r){
		double area = 3.14*r*r;
		return area;
	}
	void display(double y){
		System.out.println(" Area of circle is "+y);
	}

	public static void main(String args[]){
		qb8 l = new qb8();
		float a = l.init();
		double ar = l.calc(a);
		l.display(ar);

	}
}
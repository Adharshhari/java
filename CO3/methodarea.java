
import java.util.Scanner;
public class methodarea{
	void area(int d){
		int sq = d*d;
		System.out.println("The area of square is "+sq);
	}
	void area(int x,int y){
		int rect = x*y;
		System.out.println("The area of rectangle is "+rect);
		
	}
	void area(double r){
		
		System.out.println("The area of circle is "+3.14*r*r);
	}
	
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the side of the square");
	int sqr = sc.nextInt();
	System.out.println("Enter the Length and Breadth of the rectangle");
	int l = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Enter the radius of the circle");
	double r = sc.nextDouble();
	methodarea obj = new methodarea();
	obj.area(sqr);
	obj.area(l,b);
	obj.area(r);
	
}
	
}

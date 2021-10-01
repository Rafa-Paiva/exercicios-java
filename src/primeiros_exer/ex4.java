package primeiros_exer;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		double a,b,c,d,r,s;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n a ");
		a = leia.nextDouble();
		System.out.println("\n b ");
		b = leia.nextDouble();
		System.out.println("\n c ");
		c = leia.nextDouble();
		
		r=Math.pow((a+b), 2);
		s=Math.pow((b+c), 2);
		d=(r+s)/2 ;
		
		System.out.println("R: " + r + " ");
		System.out.println("S: " + s + " ");
		System.out.println("D: " + d);
	}
}
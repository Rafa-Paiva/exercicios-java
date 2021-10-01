package primeiros_exer;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		double n1,n2,n3,media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n nota1 ");
		n1 = leia.nextDouble();
		System.out.println("\n nota2 ");
		n2 = leia.nextDouble();
		System.out.println("\n nota3 ");
		n3 = leia.nextDouble();
		
		n1=n1*2;
		n2=n2*3;
		n3=n3*5;
		media=(n1+n2+n3)/10;
		
		System.out.println("media : " + media);
	}
}
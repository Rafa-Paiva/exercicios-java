package primeiros_exer;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		int anos,meses,dias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n ha quantos dias vc nasceu?");
		dias = leia.nextInt();
		
		anos = (dias/365);
		System.out.println("anos " + anos);
		meses = (dias/30);
		System.out.println("meses " + meses);
		System.out.println("dias " + dias);
	}
}
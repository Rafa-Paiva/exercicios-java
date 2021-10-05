package laco_condicional;

import java.util.Scanner;

public class ex4 {
	public static void main (String args [])
	{
		int n1,raiz, elev;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n escreva um numero ");
		n1 = leia.nextInt();
		
		raiz=(int) Math.sqrt(n1);
		elev = (int) Math.pow (n1,2);
		
		if(n1%2==0)
		{
			System.out.println(n1 + "[e par" + "e a raiz [e" + raiz);
		}
		else
		{
			System.out.println(n1 + "[e impar"+ "e o quadrado [e" + elev);
		}
	}

}

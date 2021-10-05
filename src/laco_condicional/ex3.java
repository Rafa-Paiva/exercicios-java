package laco_condicional;

import java.util.Scanner;

public class ex3{
	public static void main (String args [])
	{
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n qual a sua idade ");
		idade = leia.nextInt();
		
		if(idade<10 || idade>25)
		{
			System.out.println("idade invalida");
		}
		else if(idade>=10 && idade<=14)
		{
			System.out.println(" infantil ");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println(" juvenil ");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println(" adulto ");
		}
	}

}

package laco_condicional;

import java.util.Scanner;

public class ex2 {
	public static void main (String args [])
	{
		int n1,n2,n3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n numero1 ");
		n1 = leia.nextInt();
		System.out.println("\n numero2 ");
		n2 = leia.nextInt();
		System.out.println("\n numero3 ");
		n3 = leia.nextInt();
		
		if(n1 < n2 )
		{
			if (n2 < n3)
			{
				System.out.println(n1 +" "+n2+" "+n3);
			}
			else if (n1<n3)
			{
				System.out.println(n1 +" "+n3+" "+n2);
			}
			else
				System.out.println(n3 +" "+n1+" "+n2);
		}


		else if(n2 < n3 )
		{
			if (n1 < n3)
			{
				System.out.println(n2 +" "+n1+" "+n3);
			}
			else
				System.out.println(n2 +" "+n3+" "+n1);
		}
		else
		{
			System.out.println(n3 +" "+n2+" "+n1);
		}
	}

}

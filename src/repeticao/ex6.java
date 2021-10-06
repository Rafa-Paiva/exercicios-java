package repeticao;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1,soma=0,mult=0;
		float media;
		
		do 
		{
			System.out.print("digite um numero ");
			n1 = leia.nextInt();
			soma+=n1;
			
			if(n1%3==0)
			{
				soma = soma += n1;
				mult++;
			}
		} 
		while (n1 != 0);
		
		if(mult == 0) 
		{
			System.out.println("programa finalizado");
		}
		else {
			media = soma/mult;
			System.out.printf("media dos multiplos de 3: " +  media);
		}
	}
}

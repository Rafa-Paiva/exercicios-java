package repeticao;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n1,soma=0;
		
		do 
		{
			System.out.print("digite um numero ");
			n1 = leia.nextInt();
			soma+=n1;
		} 
		while (n1 != 0);
		System.out.printf("o valor da soma dos numeros [e "+ soma);
	}

}
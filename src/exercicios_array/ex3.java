package exercicios_array;

import java.util.Scanner;

public class ex3 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int maior=0;
		
		for(int linha=0 ; linha<3 ;linha++) {
			for(int coluna=0 ; coluna<3 ;coluna++) {
				System.out.printf("insira o elemento M[%d][%d]",linha+1,coluna+1);
				matriz[linha][coluna]=leia.nextInt();
				if (matriz[linha][coluna]>10)
				{
					maior=maior+1;
				}
			}
		}
		System.out.println("\n amatriz ficou \n ");
		for(int linha=0 ; linha<3 ;linha++) {
			for(int coluna=0 ; coluna<3 ;coluna++) {
				System.out.printf("\t %d \t",matriz[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println(maior);
	}
}
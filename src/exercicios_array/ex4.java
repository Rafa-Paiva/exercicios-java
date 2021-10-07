package exercicios_array;

import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		int[][] matrizsoma = new int[2][2];
		int[][] matrizsub = new int[2][2];
		int escolha;
		
		for(int linha=0 ; linha<2 ;linha++) 
		{
			for(int coluna=0 ; coluna<2 ;coluna++) 
			{
				System.out.printf("insira o elemento M1[%d][%d]",linha+1,coluna+1);
				matriz1[linha][coluna]=leia.nextInt();
			}
		}
		
		for(int linha=0 ; linha<2 ;linha++) 
		{
			for(int coluna=0 ; coluna<2 ;coluna++) 
			{
				System.out.printf("insira o elemento M2[%d][%d]",linha+1,coluna+1);
				matriz2[linha][coluna]=leia.nextInt();
			}
		}
		System.out.printf("selecione uma opcao");
		System.out.println("\n 1 somar as duas matrizes \n ");
		System.out.println("\n 2 subtrair a primeira matriz da segunda \n");
		System.out.println("\n 3 adicionar uma constante as duas matrizes \n ");
		System.out.println("\n 4 imprimir as matrizes \n ");
		escolha=leia.nextInt();
		
		if(escolha==4)
		{
			System.out.println("\n a matriz1 ficou \n ");
		for(int linha=0 ; linha<2 ;linha++) 
		{
			for(int coluna=0 ; coluna<2 ;coluna++)
			{
				System.out.printf("\t %d \t",matriz1[linha][coluna]);

			}
			System.out.println();
		}
		System.out.println("\n a matriz2 ficou \n ");
		for(int linha=0 ; linha<2 ;linha++) 
		{
			for(int coluna=0 ; coluna<2 ;coluna++)
			{
				System.out.printf("\t %d \t",matriz2[linha][coluna]);

			}
			System.out.println();
			
		}
		}
			
		
		else if(escolha==1)	
		{
			for(int linha=0 ; linha<2 ;linha++) 
			{
				for(int coluna=0 ; coluna<2 ;coluna++) 
				{
					matrizsoma[linha][coluna]=matriz1[linha][coluna]+matriz2[linha][coluna];
				}
			}
			System.out.println("\n a matrizsoma ficou \n ");
			for(int linha=0 ; linha<2 ;linha++) 
			{
				for(int coluna=0 ; coluna<2 ;coluna++)
				{
					System.out.printf("\t %d \t",matrizsoma[linha][coluna]);

				}
				System.out.println();
			}
		}
			
		else if(escolha==2)
		{
			for(int linha=0 ; linha<2 ;linha++) 
			{
				for(int coluna=0 ; coluna<2 ;coluna++) 
				{
					matrizsub[linha][coluna]=matriz1[linha][coluna]-matriz2[linha][coluna];
				}
			}
			System.out.println("\n a matrizsub ficou \n ");
			for(int linha=0 ; linha<2 ;linha++) 
			{
				for(int coluna=0 ; coluna<2 ;coluna++)
				{
					System.out.printf("\t %d \t",matrizsub[linha][coluna]);

				}
				System.out.println();
			}
		}
		
		
	}
}

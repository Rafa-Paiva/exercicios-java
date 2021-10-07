package exercicios_array;

import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] array= {1, 0, 5, -2, -5, 7};
		int soma;
		
		soma=array[0]+array[1]+array[5];
		System.out.println(soma);
		array[3]=100;
		System.out.println("\n " + array[0] + "\n " + array[1] + "\n " + array[2] + "\n " + array[3] + "\n " + array[4] + "\n " + array[5]);
	}
}
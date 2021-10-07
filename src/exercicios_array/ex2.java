package exercicios_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		List<Integer> numerosimpar = new ArrayList<>();
		
		int[] array;
		int n1,par=0,impar=0,somapar=0;
		
		System.out.println("digita um numero");
		
	       for (int i = 0; i < 6; i++) {
	    	   System.out.printf("Entre com os valores: ");
	           n1 = leia.nextInt();  

	           

	           if (n1 % 2 == 0)
	           {

	               par = par+1;
	               somapar += n1;
	           }
	           else{
	        	  numerosimpar.add(n1);
	              impar=impar+1;

	           }

	       }

	       System.out.println("Números pares digitados: " + par);
	       System.out.println("Soma dos números pares: " + somapar);
	       System.out.println("Números ímpares digitados: " + numerosimpar);
	       System.out.println("Quantidade de ímpares digitados: " + impar);        

	}

}

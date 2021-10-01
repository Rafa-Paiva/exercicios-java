package primeiros_exer;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		int horas,minutos,segundos;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n quantos segundos durou o evento?");
		segundos = leia.nextInt();
		
		System.out.println(segundos);
		minutos = (segundos/30);
		System.out.println(minutos);
		horas = (minutos/60);
		System.out.println(horas);
	}
}
package primeiros_exer;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		float anos,meses,dias,Dias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\n quantos anos vc tem?");
		anos = leia.nextFloat();
		System.out.println("\n quantos meses se passaram do seu aniversario?");
		meses = leia.nextFloat();
		System.out.println("\n quantos dias se passaram desde o dia do seu aniversario neste mes?");
		dias = leia.nextFloat();
		
		Dias = (dias+meses*30+anos*365);
		System.out.println(Dias);
	}
}

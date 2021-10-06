package repeticao;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		int idade,menor=0,maior=0;
		
		System.out.println("\n idade ");
		idade = leia.nextInt();
		
		while(idade != -99){
			if (idade>0 && idade<=21) {
					menor++;
			}
			else if(idade > 50 && idade <= 127){
				maior++;
			}
			System.out.println(" idade: ");
			idade = leia.nextInt();
		}
		System.out.println(menor + " pessoas com menos de 21 anos e "+ maior + " com mais de 50");
	}
}
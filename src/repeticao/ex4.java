package repeticao;

import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int cont = 0,idade,sexo,temperamento,totalCalmos = 0,mulheresNervosas = 0,homensAgressivos = 0,outrosCalmos = 0,nervosasAcima40 = 0,calmasMenor18 = 0;
		
		while(cont < 150) {
			System.out.println("idade: ");
			idade = leia.nextInt();
			
			System.out.println("número para a opção do sexo ");
			System.out.println("1 = femenino  2 = masculino 3 = outros");
			sexo = leia.nextInt();
			if(sexo != 1 || sexo != 2 || sexo != 3) {
				sexo = 3;
			}

			System.out.println("número para a opção do temperamento: ");
			System.out.println("1 = calma = 2-nervosa = 3-agressiva");
			temperamento = leia.nextInt();
			
			if(temperamento == 1) {
				totalCalmos++;
			}
			if(sexo == 1 && temperamento == 2) {
				mulheresNervosas++;
			} else if (sexo == 2 && temperamento == 3) {
				homensAgressivos++;
			} else if (sexo == 3 && temperamento == 1) {
				outrosCalmos++;
			}
			
			if (temperamento == 2 && idade >=40) {
				nervosasAcima40++;
			}else if (temperamento == 1 && idade <=18) {
				calmasMenor18++;
			}
			cont++;
		}
		System.out.println(" pessoas calmas: " + totalCalmos);
		System.out.println(" mulheres nervosas: " + mulheresNervosas);
		System.out.println("homens agressivos: " + homensAgressivos);
		System.out.println("Total de outros calmos: " + outrosCalmos);
		System.out.println("Total de pessoas nervosas com mais de 40 anos: " + nervosasAcima40);
		System.out.println("Total de menores de 18 anos calmos: " + calmasMenor18);
	}
}
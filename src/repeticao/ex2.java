package repeticao;

public class ex2 {

	public static void main(String[] args) {
		
		int pares=0,impares=0;
		
		for(int x=0; x<10; x++)
		{
			if(x%2==0){
				pares=pares+1;
			}
			if(x%2!=0){
				impares=impares+1;
			}
			
		}
		System.out.println("pares : " + pares + " impares : " + impares);
	}
}
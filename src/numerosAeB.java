import java.util.Scanner;

public class numerosAeB {

	public static void main(String[] args) {
		
		int A, B;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Coloque um número");
		
		A = entrada.nextInt();
		
		System.out.println("Coloque outro número");
		B = entrada.nextInt();
		
		System.out.println("Os números ímpares entre "+A+" e "+B+" são: ");
		
		if(A%2==0)
			A+=1;
		else
			A+=2;
		if(B>A)
			while(B>A) {
				System.out.print(A+" ");
				A+=2;
				
			}
		else System.out.println("Nenhum.");
		
		
		

		
		
		
		
		

	}

}

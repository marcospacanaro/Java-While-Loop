package forWhile;
import java.util.Scanner;

public class ex02 {
		public static void main (String args[])
		{
			Scanner leia = new Scanner (System.in);
			int contadorPar=0, contadorImpar=0, i, numero;
			
			for (i=0; i < 10; i++)
			{
				
				System.out.println("Digite um n�mero: ");
				numero = leia.nextInt();
				
				if (numero % 2 == 0)
				{
					contadorPar++;
				}
				
				else 
				{
					contadorImpar++;
				}
			}
			
			System.out.println("A quantidade de n�meros pares �: " +contadorPar+ ".");
			System.out.println("A quantidade de n�meros �mpares �: " +contadorImpar+ ".");
			
			 
			
		}
}

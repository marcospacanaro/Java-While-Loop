package forWhile;
import java.util.Scanner;

public class ex03 {
	public static void main (String args[])
	{
		Scanner leia = new Scanner (System.in);
		int idade, vint=0, cin=0;
		
		System.out.println(("Digite sua idade: "));
		idade = leia.nextInt();
		
		while (idade != -99)
		{
			if (idade < 21)
			{
				vint++;
			}
			
			if (idade > 50)
			{
				cin++;
			}
			
			System.out.println(("Digite sua idade: "));
			idade = leia.nextInt();
		}
		
		System.out.println("Temos: " +vint+ " pessoa(s) com menos de 21 anos.");
		System.out.println("Temos: " +cin+ " pessoa(s) com mais de de 50 anos.");
	}
	
}
		
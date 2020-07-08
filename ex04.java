package forWhile;
import java.util.Scanner;

public class ex04 {
	public static void main (String args[])
	{
		Scanner read = new Scanner (System.in);
		int idade, sexo, humor, contPessoas=0, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, pessoasNervosasMaior=0, pessoasCalmasMenor=0; 
			
		
		while (contPessoas <= 4)
		{
			
			System.out.println("Digite sua idade: ");
			idade = read.nextInt();
			System.out.println("Qual seu sexo? 1 para Mulher, 2 para Homem.");
			sexo = read.nextInt();
			System.out.println("Qual o seu humor? 1 para Calmo, 2 para Nervoso, 3 para Agressivo.");
			humor = read.nextInt();
									
			if(humor == 1) {
				pessoasCalmas++;
			}
			
			if (sexo == 1 && humor == 2) {
				mulheresNervosas++;
			}
			
			if (sexo == 2 && humor == 3 ) {
				homensAgressivos++;
			}
			
			if (humor == 2 && idade > 40) {
				pessoasNervosasMaior++;
			}
			
			if (humor == 1 && idade < 18) {
				pessoasCalmasMenor++;
			}
								
			contPessoas++;
		}
		
		System.out.println("Pessoas calmas: " +pessoasCalmas+ ".");
		System.out.println("Mulheres nervosas: " +mulheresNervosas+ ".");
		System.out.println("Homens agressivos: " +homensAgressivos+ ".");
		System.out.println("Pessoas nervosas com mais de 40 anos: " +pessoasNervosasMaior+ ".");
		System.out.println("Pessoas calmas com menos de 18 anos: " +pessoasCalmasMenor+ ".");
	}
}

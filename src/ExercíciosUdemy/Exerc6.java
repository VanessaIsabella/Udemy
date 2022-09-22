package ExercíciosUdemy;

import java.util.Scanner;

public class Exerc6 {

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. 
 * A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.println("\nEntre com o primeiro valor: ");
		a=leia.nextInt();
		System.out.println("\nEntre com o segundo valor: ");
		b=leia.nextInt();
		System.out.println("\nEntre com o terceiro valor: ");
		c=leia.nextInt();
		System.out.println("\nEntre com o quarto valor: ");
		d=leia.nextInt();
		
		diferenca= a*b - c*d;
		
		System.out.println("\n Diferença = " +diferenca);
		
		
		

	}

}

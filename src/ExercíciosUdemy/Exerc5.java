package ExercíciosUdemy;

import java.util.Scanner;

public class Exerc5 {

	
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor 
 * da área deste círculo com quatro casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double raio, area, pi=3.14159;
		
		System.out.println("\nEntre com um número: ");
		raio=leia.nextDouble();
		
		area=pi * raio * raio;
		
		System.out.printf("area=%.4f%n", area);

	}

}

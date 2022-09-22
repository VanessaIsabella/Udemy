package ExercíciosUdemy;

import java.util.Scanner;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.*/

public class Exerc8 {
	
	public static void main(String[] args) {
		
Scanner leia = new Scanner (System.in);
		
	    double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;       
	         
	         
			a = leia.nextDouble();
			b = leia.nextDouble();
			c = leia.nextDouble();
				
			triangulo = a * c / 2.0;
			circulo = 3.14159 * c * c;
			trapezio = (a + b) / 2.0 * c;
			quadrado = b * b;
			retangulo = a * b;
			
			System.out.printf("TRIANGULO: %.3f%n", triangulo);
			System.out.printf("CIRCULO: %.3f%n", circulo);
			System.out.printf("TRAPEZIO: %.3f%n", trapezio);			
			System.out.printf("QUADRADO: %.3f%n", quadrado);
			System.out.printf("RETANGULO: %.3f%n", retangulo);
					
	}
}
		
	
		
	


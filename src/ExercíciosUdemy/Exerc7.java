package ExercíciosUdemy;

import java.util.Scanner;

public class Exerc7 {

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
 * o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e 
o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double preco1, preco2, total;
		
		System.out.println("\nDigite o código da peça : ");
		cod1=leia.nextInt();
		System.out.println("\nDigite a quantidade de peças :");
		qtd1=leia.nextInt();
		System.out.println("\nDigite o valor das peças :");
		preco1=leia.nextDouble();
		
		System.out.println("\nDigite o código da peça : ");
		cod2=leia.nextInt();
		System.out.println("\nDigite a quantidade de peças :");
		qtd2=leia.nextInt();
		System.out.println("\nDigite o valor das peças :");
		preco2=leia.nextDouble();
		
		total=preco1*qtd1 + preco2*qtd2;
		
		System.out.printf("\nValor a pagar : %.2f%n " ,total);

	}

}

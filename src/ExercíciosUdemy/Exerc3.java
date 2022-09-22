package ExercíciosUdemy;

import java.util.Locale;
import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
//exerc para ler algo do teclado/console		
		
//Locale.setDefault(Locale.US); localização eua, aceita o . em double 
		Scanner leia = new Scanner (System.in);
		
		/*String x;
		x = leia.next();
		//x = leia.nextInt(); caso a variável seja int
		//x=leia.nextDouble(); caso a variável seja double
		System.out.println("Você digitou : " +x);
		
		leia.close();*/
		
		//ler vários dados na mesma linha
		String a;
		int y;
		double z;
		a=leia.next();
		y=leia.nextInt();
		z=leia.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(a);
		System.out.println(y);
		System.out.println(z);
	

	}

}

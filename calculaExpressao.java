package Turma15;

import java.util.Scanner;

public class calculaExpressao {
	public static void main(String[] args) {
		int a, b, c;
		float d;
				
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite o a: ");
			a= ler.nextInt();
			System.out.println("Digite o b: ");
			b= ler.nextInt();
			System.out.println("Digite o c: ");
			c= ler.nextInt();
		}
		
		d= (((float) Math.pow((a+b), 2))+ ((float) Math.pow((b+c), 2)))/2;
		
		System.out.println("\nO resultado da expressão é "+d);
		
	}
	
}

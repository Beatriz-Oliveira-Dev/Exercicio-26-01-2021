package Turma15;

import java.util.Scanner;

public class distanciaPlanos {
	public static void main(String[] args) {
		double d,x2,x1,y2,y1;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("\nEscreva o X1");
			x1 = ler.nextFloat();
			System.out.println("\nEscreva o X2");
			x2 = ler.nextFloat();
			System.out.println("\nEscreva o Y1");
			y1 = ler.nextFloat();
			System.out.println("\nEscreva o Y2");
			y2 = ler.nextFloat();
		}
		
		d=(float) Math.sqrt(Math.pow((x2-x1), 2)+Math.pow(y2-y1, 2));
		
		System.out.printf("\nO resultado é: %2.2f",d);
	}

}

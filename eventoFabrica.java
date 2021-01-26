package Turma15;

import java.util.Scanner;

public class eventoFabrica {
	public static void main(String[] args) {
	int segundos, hora, minutos;
	
	try (Scanner ler = new Scanner(System.in)) {
		System.out.println("Quanto tem o evento em segundos? ");
		
		segundos=ler.nextInt();
	}
	hora=segundos/3600;
	minutos=(segundos%3600)/60;
	System.out.println("\nO evento é de "+hora+" hora(s),"+minutos+" minuto(s) e "+segundos+" segundo(s)");
	
}
}

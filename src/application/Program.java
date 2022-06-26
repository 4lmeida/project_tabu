package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual numero(0 a 10) da tabuada você deseja? ");
		int tabu = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			int produto = i * tabu; 
			System.out.printf(tabu + " X " + i + " = " + produto + "\n");
		}
		
		System.out.println("DevAtlect");
		
		sc.close();

	}

}

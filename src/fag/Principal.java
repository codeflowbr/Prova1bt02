package fag;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe seu nome e sua idade:");
		String nome = scan.nextLine();
		int idade = scan.nextInt();
		
		System.out.println("Seu nome é:"+ nome +", Sua idade é: "+ idade);
	}

}

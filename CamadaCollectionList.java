package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CamadaCollectionList {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<>();
		
		//cria o ArrayList usando o for e o add para adicionar cores
		for(int i = 0; i<5; i++) {
			System.out.println("Digite a cor " + (i+1) + ": ");
			String cor = sc.nextLine();
			cores.add(cor);
		}
		
		//usado para chamar todas as cores
		System.out.println("Listar todas as cores:");
		for (String cor: cores) {
			System.out.println(cor);
		}
		
		// o sort lista as cores em ordem alfabética
		Collections.sort(cores);
		System.out.println("Ordenar as cores:");
		System.out.println(" " +cores);
		
		sc.close();
	}

}

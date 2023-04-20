package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CamadaCollectionSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//integer = numeros inteiros hashset = elementos não são ordenados
		Set<Integer> numeros = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número " + (i+1)+  ": ");
			int numero = sc.nextInt();
		//contains verifica se o elemento está armazenado na collection
			while (numeros.contains(numero)) {
                System.out.println("Número já digitado,por favor digite outro número: ");
                numero = sc.nextInt();
            }
			numeros.add(numero);	
		}
		
		System.out.println("Listar dados do Set:");
		// interator acessa o conteúdo da coleção sem expor sua representação interna, percorre todos os elementos do HashSet 
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        sc.close();
	}
}

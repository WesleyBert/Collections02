package collections02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class exercicio2 {
	
	public static void main(String args[]) {
	
	Stack<String> livros = new Stack<String>();
	Scanner leitor = new Scanner(System.in);
	int op;
	
	do {
		System.out.println("****************************");
		System.out.println("\n\t\t Bem vindo(a) ao estoque da biblioteca!");
		System.out.println("1 - Digite o nome do livro que deseja adicionar: ");
		System.out.println("2 - Mostrar todos os livros da biblioteca: ");
		System.out.println("3 - Alugar livro e retirar do estoque de disponiveis");
		System.out.println("0 - Finalizar acesso: ");
		op = leitor.nextInt();
		
		switch(op) {
		case 1:
			leitor.nextLine();
			System.out.println("Digite o nome do livro que deseja adicionar: ");
			String nome = leitor.nextLine();
			livros.add(nome);
			System.out.println("\nLivro adicionado corretamente!");
			for(Iterator<String> estoque = livros.iterator(); estoque.hasNext();) {
				System.out.println(estoque.next());
			}
			break;
		case 2:
			leitor.nextLine();
			if(livros.isEmpty() == true) {
				System.out.println(" O estoque de livros está vazio!!");
			}else {
				System.out.println("Lista de livros: ");
				for(Iterator<String> estoque = livros.iterator(); estoque.hasNext();) {
					System.out.println(estoque.next());
				}
			}
			break;
		case 3:
			leitor.nextLine();
			if(livros.isEmpty() == true) {
				System.out.println("o estoque está vazia!");
			}else {
				livros.pop();
				System.out.println("");
				for(Iterator<String> estoque = livros.iterator(); estoque.hasNext();) {
					System.out.println(estoque.next());
				}
			}
			break;
		case 0: 
			System.out.println("Programa finalizado com sucesso!");
			break;
		default: 
			System.out.println("Opção inválida!");
	
			}
				
	
	}while(op != 0);
}
	}
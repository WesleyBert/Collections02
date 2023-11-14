package collections02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Queue<String> listaEspera = new LinkedList<String>();
		Scanner entrada = new Scanner(System.in);
		int op = 0;
		
		do {
			System.out.println("***************************************");
			System.out.println("\t\t\t\n Ordem de chegada de clientes");
			System.out.println(" 1 - Adicione o nome do novo cliente da fila: ");
			System.out.println(" 2 - Listar todos os clientes da lista:  ");
			System.out.println(" 3 - Retirar nome do cliente da fila: ");
			System.out.println(" 0 - Sair");
			
			op = entrada.nextInt();
			
			switch(op) {
			case 1:
				entrada.next();
				System.out.println("Digite o nome do cliente: ");
				String nome = entrada.nextLine();
				if(nome.isBlank()) {
					System.out.println("erro ao adicionar nome do cliente! tente novamente!");
				}else {
					listaEspera.add(nome);
					System.out.println("Cliente adicionado a lista com sucesso!!");
				}
				break;
			case 2:
				entrada.nextInt();
				System.out.println("A lista de todos os clientes: ");
				for(Iterator<String> resultado = listaEspera.iterator(); resultado.hasNext();) {
					System.out.println(resultado.next());
				}
				break;
			case 3:
				entrada.nextLine();
				if(listaEspera.isEmpty() == true) {
					System.out.println("Lista está vazia! ");
				}else {
					System.out.printf("/ncliente %s foi chamado", listaEspera.poll());
					System.out.println("Lista atual de espera é:");
					for(Iterator<String> resultado = listaEspera.iterator();resultado.hasNext();) {
						System.out.println(resultado.next());
					}
				
				}
			case 0:
				System.out.println("Obrigado por aguarda!");
				break;
				default:
					System.out.println("Opção inválida! tente novamente!");
			}
		}while(op != 0);
	}

}

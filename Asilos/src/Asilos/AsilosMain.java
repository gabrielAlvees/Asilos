package Asilos;
import java.util.Scanner;
public class AsilosMain {
	public static void main (String [] args) {
//		Criando as Residencias:
		Residencial residencia1 = new Residencial("Residencial 1", "Endereço", 123456789, 5);
		Residencial residencia2 = new Residencial("Residencial 2", "Endereço", 123456789, 3);
		Residencial residencia3 = new Residencial("Residencial 3", "Endereço", 123456789, 5);
		Residencial residencia4 = new Residencial("Residencial 4", "Endereço", 123456789, 1);
		Residencial residencia5 = new Residencial("Residencial 5", "Endereço", 123456789, 4);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha uma faixa de preço de 2000 a 10000");
		int preco = scanner.nextInt();
//		Ler a proxima linha
		scanner.nextLine();
	
		switch(preco) {
			case 2000:
				System.out.println("Escolheu 2000");
				break;
			case 5000:
				System.out.println("Escolheu 5000");
				break;
			case 10000:
				System.out.println("Escolheu 10000");
				break;
		} 
		
		System.out.println("Escolha uma região");
		String regiao = scanner.nextLine().toUpperCase();
	
		switch(regiao) {
			case "ZONA NORTE":
				System.out.println("Norte");
				break;
			case "ZONA SUL":
				System.out.println("Sul");
				break;
			case "ZONA LESTE":
				System.out.println("Leste");
				break;
			case "ZONA OESTE":
				System.out.println("Oeste");
				break;
			default:
				System.out.println("Região Invalida");
				break;
		} 
		
		FaixaPreco faixaPreco1 = new FaixaPreco(preco, regiao);
		
//		System.out.println("você escolheu o:" + faixaPreco1.preco + faixaPreco1.regiao);
		
//		Classe User: dados dos usuários
		User user = new User();
		
		System.out.println("Nome Responsável:");
		user.setNomeResponsavel(scanner.nextLine());

		System.out.println("Nome do Idoso:");
		user.setNomeIdoso(scanner.nextLine());
		
		System.out.println("Digite um E-mail");
		user.setMail(scanner.nextLine());
		
		System.out.println("Digite um telefone");
		user.setTelefone(scanner.nextInt());
		scanner.close();
		
		if (faixaPreco1.preco == 2000 && faixaPreco1.regiao.equals("ZONA NORTE")) {
		    System.out.println("Escolha válida para ZONA NORTE: " + residencia1.nome);
		} else if (faixaPreco1.preco == 5000 && faixaPreco1.regiao.equals("ZONA SUL")) {
		    System.out.println("Escolha válida para ZONA SUL: " + residencia2.nome);
		} else if (faixaPreco1.preco == 10000 && faixaPreco1.regiao.equals("ZONA LESTE")) {
		    System.out.println("Escolha válida para ZONA LESTE: " + residencia3.nome);
		} else {
		    System.out.println("Nenhuma pesquisa encontrada");
		}
	}
}

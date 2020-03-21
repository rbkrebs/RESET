package calculadorapagamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraFolhaMensal {

	public static void main(String[] args) {
		System.out.println("----------- Aplicação calculo folha mensal       -----------\n\n");
		int opcao = 0;
		List<Funcionario> funcionarioList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (opcao != 9) {
			imprimeMenu();
			opcao = lerInteiro();
			if (opcao == 1) {
				// Cadastra Engenheiro
				System.out.println("Digite o nome do engenheiro: ");
				String nome = scanner.next();
				System.out.println("Digite o cpf: ");
				String cpf = scanner.next();
				System.out.println("Digite o salario: ");
				double salario = scanner.nextDouble();
				Engenheiro eng = new Engenheiro(nome,cpf,salario);
				funcionarioList.add(eng);
			} else if (opcao == 2) {
				// Cadastra Programador
				System.out.println("Digite o nome do programador: ");
				String nome = scanner.next();
				System.out.println("Digite o cpf: ");
				String cpf = scanner.next();
				System.out.println("Digite o salario: ");
				double salario = scanner.nextDouble();
				System.out.println("Digite o numero de certificações: ");
				int certificacoes = scanner.nextInt();
				Programador programador = new Programador(nome,cpf,salario, certificacoes);
				funcionarioList.add(programador);
			} else if (opcao == 3) {
				// Cadastra Gerente
				System.out.println("Digite o nome do Gerente: ");
				String nome = scanner.next();
				System.out.println("Digite o cpf: ");
				String cpf = scanner.next();
				System.out.println("Digite o salario: ");
				double salario = scanner.nextDouble();
				System.out.println("Digite o valor do lucro do último ano: ");
				double lucro = scanner.nextDouble();
				Gerente gerente = new Gerente(nome,cpf,salario, lucro);
				funcionarioList.add(gerente);

			} else {
				System.out.println("----------- Opção invalida               -----------");
			}
		}
		// Calculo da folha mensal

	}

	private static int lerInteiro() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	private static void imprimeMenu() {
		System.out.println("----------- 1 - Cadastro Engenheiro              -----------");
		System.out.println("----------- 2 - Cadastro Programador             -----------");
		System.out.println("----------- 3 - Cadastro Gerente                 -----------");
		System.out.println("----------- 9 - Calcular e imprimir folha mensal -----------");
	}
}

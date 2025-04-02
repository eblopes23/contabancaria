package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;


public class Menu {

	public static void main(String[] args) {
		
		ContaController contas = new ContaController();
		
		Scanner sc = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		
		System.out.println("\nCriar Contas\n");
		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(),123,1,"João da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);
		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumero(),124,1,"Maria da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(),125,2,"Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);
		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(),125,2,"Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);
		
		contas.listarTodas();
		
		while(true) {
			
			System.out.println(Cores.TEXT_RED_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
						+		"**************************************************************");
			System.out.printf("\n");
			System.out.printf("                  BANCO COMMUNA                               \n");
			System.out.printf("\n**************************************************************");
			System.out.printf("\n");
			System.out.printf("           1 - Criar Conta                   \n");
			System.out.printf("           2 - Listar todas as contas        \n");
			System.out.printf("           3 - Buscar Conta por Numero       \n");
			System.out.printf("           4 - Atualizar Dados da Conta      \n");
			System.out.printf("           5 - Apagar Conta                  \n");
			System.out.printf("           6 - Sacar                         \n");
			System.out.printf("           7 - Depositar                     \n");
			System.out.printf("           8 - Transferir Valores Entre Contas     \n");
			System.out.printf("           9 - Sair                          \n");
			System.out.printf("\n");
			System.out.printf("**************************************************************");
			System.out.printf("\nEntre com a opção desejada:\n");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			
			try {
				opcao = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				sc.nextLine();
				opcao=0;
			}
			
			if(opcao == 9) {
				System.out.println(Cores.TEXT_RED_BOLD +"\n Banco Communa - Todos nossos bens são seus!");
				sobre();
				sc.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_BLACK +"Criar conta\n\n");
				
				System.out.println("Digite o número da agência: ");
				agencia = sc.nextInt();
				System.out.println("Digite o nome do titular: ");
				sc.skip("\\R?");
				titular = sc.nextLine();
				
				do {
					System.out.println("Digite o tipo de conta (1 - CC ou 2 - CP): ");
					tipo = sc.nextInt();
				}while(tipo < 1 && tipo > 2);
				
				System.out.println("Digite o saldo da conta: R$ ");
				saldo = sc.nextFloat();

				switch(tipo) {
					case 1 ->{
						System.out.println("Digite o limite de crédito: R$ ");
						limite = sc.nextFloat();
						contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					}
					case 2->{
						System.out.println("Digite o dia do aniversário da conta: ");
						aniversario = sc.nextInt();
						contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					}
				}
				keyPress();
				break;
				
			case 2:
				System.out.println(Cores.TEXT_BLACK +"Listar todas as contas\n\n");
				contas.listarTodas();
				keyPress();
				break;
				
			case 3:
				System.out.println(Cores.TEXT_BLACK +"Consultar dados da conta\n\n");
				
				keyPress();
				break;
				
			case 4:
				System.out.println(Cores.TEXT_BLACK +"Atualizar dados da conta\n\n");
				
				keyPress();
				break;
				
			case 5:
				System.out.println(Cores.TEXT_BLACK +"Apagar a conta\n\n");
				
				keyPress();
				break;
			
			case 6:
				System.out.println(Cores.TEXT_BLACK +"Saque\n\n");
				
				keyPress();
				break;
				
			case 7:
				System.out.println(Cores.TEXT_BLACK +"Depósito\n\n");
				
				keyPress();
				break;
				
			case 8:
				System.out.println(Cores.TEXT_BLACK +"Transferência entre contas\n\n");
				
				keyPress();
				break;
			
			default:
				System.out.println(Cores.TEXT_YELLOW_BOLD +"\nOpção inválida\n");
				
				keyPress();
				break;
			}
		}

	}

	public static void sobre() {
		System.out.printf("\n********************************************************\n");
		System.out.printf("\nProjeto enviado por: Elisa Bicudo Lopes\n");
		System.out.printf("Elisa Bicudo Lopes- elisal@genstudents.org\n");
		System.out.printf("github.com/eblopes23\n");
		System.out.printf("\n********************************************************\n");

	}
	
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}

package conta;

import java.util.Scanner;

import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
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

			
			opcao = sc.nextInt();
			
			if(opcao == 9) {
				System.out.println(Cores.TEXT_RED_BOLD +"\n Banco Communa - Todos nossos bens são seus!");
				sobre();
				sc.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE +"Criar conta\n\n");
				
				break;
				
			case 2:
				System.out.println(Cores.TEXT_WHITE +"Listar todas as contas\n\n");
				
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE +"Consultar dados da conta\n\n");
				
				break;
				
			case 4:
				System.out.println(Cores.TEXT_WHITE +"Atualizar dados da conta\n\n");
				
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE +"Apagar a conta\n\n");
				
				break;
			
			case 6:
				System.out.println(Cores.TEXT_WHITE +"Saque\n\n");
				
				break;
				
			case 7:
				System.out.println(Cores.TEXT_WHITE +"Depósito\n\n");
				
				break;
				
			case 8:
				System.out.println(Cores.TEXT_WHITE +"Transferência entre contas\n\n");
				
				break;
			
			default:
				System.out.println(Cores.TEXT_YELLOW_BOLD +"\nOpção inválida\n");
				
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
}

package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int opcao;
		
		Conta c1 = new Conta(18001, 001, 1, "Renata", 500000);
		
		c1.sacar(600);
		c1.visualizar();
		c1.sacar(90000000);
		
		c1.depositar(1900);
		c1.visualizar();
		
		c1.setTitular("Renata Negrini");
		c1.visualizar();

		while (true) {

			System.out.println(Cores.ANSI_ORANGE_BACKGROUND_BRIGHT + Cores.TEXT_BLUE_PETROLEUM_BOLD +
					           "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println(Cores.ANSI_BLUE_PETROLEUM_BACKGROUND + Cores.TEXT_WHITE +
					           "                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println(Cores.ANSI_ORANGE_BACKGROUND_BRIGHT + Cores.TEXT_BLUE_PETROLEUM_BOLD +
					           "*****************************************************");
			System.out.print(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_WHITE_BOLD +
					         "\nEntre com a opção desejada: ");
			
			opcao = leia.nextInt();
			System.out.println(Cores.TEXT_RESET + "");

			if (opcao == 9) {
				System.out.println(Cores.ANSI_ORANGE_BACKGROUND_BRIGHT + Cores.TEXT_WHITE_BOLD_BRIGHT + "\nBanco do Brazil com Z - O seu Futuro começa aqui!        ");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar Conta\n\n");
					
					
					break;
				case 2:
					System.out.println("Listar todas as Contas\n\n");
					c1.visualizar();

					break;
				case 3:
					System.out.println("Consultar dados da Conta - por número\n\n");

					break;
				case 4:
					System.out.println("Atualizar dados da Conta\n\n");

					break;
				case 5:
					System.out.println("Apagar a Conta\n\n");

					break;
				case 6:
					System.out.println("Saque\n\n");
					c1.sacar(600);

					break;
				case 7:
					System.out.println("Depósito\n\n");
					c1.depositar(1900);

					break;
				case 8:
					System.out.println("Transferência entre Contas\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}

	}
	
	public static void sobre() {
		System.out.println(Cores.ANSI_ORANGE_BACKGROUND_BRIGHT + Cores.TEXT_WHITE_BOLD_BRIGHT + "\n*********************************************************");
		System.out.println(Cores.ANSI_BLUE_PETROLEUM_BACKGROUND + Cores.TEXT_WHITE_BOLD + "Projeto Desenvolvido por:                                ");
		System.out.println("Renata Negrini - renata.negrini@gmail.com.br             ");
		System.out.println("github.com/renatangr                                     ");
		System.out.println(Cores.ANSI_ORANGE_BACKGROUND_BRIGHT + Cores.TEXT_WHITE_BOLD_BRIGHT + "*********************************************************");
	}
}

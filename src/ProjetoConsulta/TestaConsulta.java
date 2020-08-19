package ProjetoConsulta;

import java.util.Scanner;

public class TestaConsulta extends Consulta{
	public static void main(String[] args) {
		
		int plano;
		
		Scanner leia = new Scanner(System.in);
		
		Consulta pac = new Consulta();
		ConsultaPrata planP = new ConsultaPrata();
		ConsultaOuro planO = new ConsultaOuro();
		ConsultaDiamante planD = new ConsultaDiamante();
		ConsultaFamilia planF = new ConsultaFamilia();
		
		
		System.out.println("Nome do paciênte: ");
		pac.setNomeDoPaciente(leia.nextLine());	
		System.out.println("Código da matrícula(Máximo 5 Digitos): ");
		pac.setMatricula(leia.nextLine(),5);
		System.out.println("Número de dependentes: ");
		pac.setNumeroDeDependentes(leia.nextInt());
		System.out.println("Ano de inclusão no plano: ");
		pac.setAnoInclusaoPlano(leia.nextInt());
		System.out.println("Valor da consulta: ");
		pac.setValorConsulta(leia.nextDouble());
			
		System.out.println("Informe o número do seu plano, conforme as opcões abaixo: ");
		System.out.println("1 - Prata ----> 20% Desconto.");
		System.out.println("2 - Ouro -----> 30% Desconto, ou 100% se ano de inclusão for menor ou igual a 2000.");
		System.out.println("3 - Diamante -> 40% Desconto.");
		System.out.println("4 - Familia --> 50% Desconto se o número de dependentes for maior que 2.");
		
		plano = leia.nextInt(); leia.nextLine();
		
		System.out.println("Nome do paciênte: " + pac.getNomeDoPaciente());		
		System.out.println("Código da matrícula: " + pac.getMatricula());		
		System.out.println("Número de dependentes: " + pac.getNumeroDeDependentes());		
		System.out.println("Ano de inclusão no plano: " + pac.getAnoInclusaoPlano());		
		
		
		switch (plano) {
		case 1:				
			System.out.println("Plano escolhido: Prata");
			System.out.print("Valor a pagar: R$ ");
			planP.setValorConsulta(pac.getValorConsulta());
			System.out.println(planP.getValorConsulta());
			break;
		case 2:			
			System.out.println("Plano escolhido: Ouro");
			System.out.print("Valor a pagar: R$ ");
			planO.setValorConsulta(pac.getValorConsulta());
			planO.setAnoInclusaoPlano(pac.getAnoInclusaoPlano());
			System.out.println(planO.getValorConsulta());		
			break;
		case 3:
			
			System.out.println("Plano escolhido: Diamante");
			System.out.print("Valor a pagar: R$ ");
			planD.setValorConsulta(pac.getValorConsulta());
			System.out.println(planD.getValorConsulta());
			break;
		case 4:			
			System.out.println("Plano escolhido: Família");
			System.out.print("Valor a pagar: R$ ");
			planF.setValorConsulta(pac.getValorConsulta());
			planF.setNumeroDeDependentes(pac.getNumeroDeDependentes());
			System.out.println(planF.getValorConsulta());
			break;	
		}	
		
		leia.close();
	}
}

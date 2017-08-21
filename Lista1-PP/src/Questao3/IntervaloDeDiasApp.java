package Questao3;

import java.util.Scanner;

public class IntervaloDeDiasApp {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("Digite a data:");
			int dia = input.nextInt();
			int mes = input.nextInt();
			int ano = input.nextInt();
			Data data = new Data(dia, mes, ano);
			System.out.println("Faltam " + data.getQuantidadeDeDias() + " dia(s) para a data " + dia + "/" + mes + "/" + ano);

			
		} catch(DataInvalidaException e){
			System.err.println(e.getMessage());
		}
	}

}

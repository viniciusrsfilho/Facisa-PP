package Questao1;

import java.util.Scanner;

public class NomeDoMesApp {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("Digite o numero do mes: ");
			Mes mes = new Mes(input.nextInt());
			System.out.println(mes.getNome());
		} catch(MesInvalidoException e){
			System.err.println(e.getMessage());
		}
	}

}

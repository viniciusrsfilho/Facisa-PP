package Questao2;

import java.util.Scanner;

public class NomeInvertidoApp {
	
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
		try{
			System.out.print("Digite seu nome: ");
			Pessoa p = new Pessoa();
			p.setNome(input.nextLine());
			System.out.print("Nome invertido: " + p.getNomeInvertido());
		} catch(NomeInvalidoException e){
			System.err.println(e.getMessage());
		}
	}

}

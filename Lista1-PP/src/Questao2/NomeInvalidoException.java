package Questao2;

public class NomeInvalidoException extends Exception{
	
	public NomeInvalidoException(){
		super("O nome fornecido n�o pode ser nulo ou vazio");
	}

}

package Questao1;

public class MesInvalidoException extends Exception{

	public MesInvalidoException() {
		super("O n�mero do m�s deve estar contido no intervalo [1, 12]");
	}
}

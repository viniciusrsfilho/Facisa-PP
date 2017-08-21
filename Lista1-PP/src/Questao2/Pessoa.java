package Questao2;

public class Pessoa 
{
	private String nome;
	
	public void setNome(String nome) throws NomeInvalidoException{
		if(nome == null || nome.trim().equals("")){
			throw new NomeInvalidoException();
		}
		this.nome = nome;
	}
	
	public String getNomeInvertido()
	{	StringBuilder builder = new StringBuilder();
		for (int i = nome.length() - 1; i >= 0; i--)
		{	builder.append(nome.charAt(i));
		}
		return builder.toString();
	}
}

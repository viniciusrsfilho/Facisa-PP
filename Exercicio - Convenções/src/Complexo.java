//erro1
//erro2
/**
 * erwerafafaafa
 * @author aluno
 *
 */
//erro7
public class Complexo {
	
	//erro3
	private double real;
	private double imaginario;
	
	//erro4
	/**
	 * Controi um numero complexo. A parte real sera 0.0 e a parte imaginaria
	 * tambem sera 0.0.
	 */
	public Complexo() {
		real = 0.0;
		imaginario = 0.0;
	}

	/**
	 * Cria um numero complexo.
	 * 
	 * @param i
	 *            parte imaginaria do numero complexo
	 */
	//erro5
	public Complexo(double r, double i) {
		real = r;
		imaginario = i;
	}

	/**
	 * Soma um valor inteiro ao numero imaginario
	 * 
	 * @param n
	 *            valor inteiro a ser somado
	 */
	public void soma(int n) {
		real += n;
		imaginario += n;
	}

	/**
	 * Soma um numero imaginario a este numero imaginario
	 * 
	 * @param c
	 *            numero imaginario a ser somado
	 */
	//erro6
	public void soma(Complexo c) {
		real += c.real;
		imaginario += c.imaginario;
	}
}
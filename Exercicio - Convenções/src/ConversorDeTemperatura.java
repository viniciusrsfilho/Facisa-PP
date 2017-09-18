//erro1

/**
 * aeufohasfuohsfulhs
 * @author aluno
 *
 */
//erro2
public class ConversorDeTemperatura {
	//erro3
	private static final double OFFSET = 32.0;
	private static final double FATOR_A = 5.0;
	private static final double FATOR_B = 32.0;

	/**
	 * Metodo que converte temperatura de Fahrenheit para Celsius.
	 * @param temperatura em Fahrenheit
	 * 
	 * @return temperatura em Celsius
	 */
	//erro4
	//erro5
	public static double getTempCelsius(double tempFahrenheit) {
		return FATOR_A * (tempFahrenheit - OFFSET) / FATOR_B;
	}

	/**
	 * Metodo que converte temperatura de Celsius para Fahrenheit.
	 * 
	 * @param tempCelsius
	 *            temperatura em Celsius
	 *            
	 * @return temperatura em Fahrenheit            
	 */
	//erro6
	public static double getTempFahrenheit(double tempCelsius) {
		return FATOR_B * tempCelsius / 5.0 + OFFSET;
	}
}

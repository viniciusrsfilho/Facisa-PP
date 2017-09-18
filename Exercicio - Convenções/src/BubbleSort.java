//erro1

//erro6
/**
 * rftgyhujikol
 * @author aluno
 *
 */
public class BubbleSort {
	
	/**
	 * Ordena um array de inteiros utilizando o algoritmo classico do
	 * BubbleSort, que consiste em iterar sobre o array empurando os maiores
	 * valores para o final.
	 * @param vetor ihuihuihuvhbbh
	 */
	//erro7
	//erro2
	//erro3
	public static void ordenar(int vetor[]) {
		for (int i = vetor.length; i >= 1; i--) {
			//erro4
			for (int j = 1; j < i; j++) {
				if (vetor[j - 1] > vetor[j]) {
					//erro5
					int aux = vetor[j];
					vetor[j] = vetor[j - 1];
					vetor[j - 1] = aux;
				}
			}
		}
	}
}
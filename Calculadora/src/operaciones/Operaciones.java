package operaciones;
/**
 * 
 * @author Hodei Axpe
 *
 */
public class Operaciones{
	/**
	 * Llegan dos valores desde parametro, crea una variable tipo int donde se va a guardar la suma
	 * @param valor1 primer valor
	 * @param valor2 segundo valor
	 * @return numero te devulve la suma de los 2 valores 
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /**
     * Llegan dos valores desde parametro, crea una variable tipo int donde se va a guardar la resta
     * @param valor1 primer valor
     * @param valor2 segundo valor
     * @return numero te devulve la resta de los 2 valores 
     */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
     * Llegan dos valores desde parametro, crea una variable tipo int donde se va a guardar la multiplicacion
     * @param valor1 primer valor
     * @param valor2 segundo valor
     * @return numero te devulve la multiplicacion de los 2 valores 
     */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
     * Llegan dos valores desde parametro, crea una variable tipo int donde se va a guardar la division
     * @param valor1 primer valor
     * @param valor2 segundo valor
     * @return numero te devulve la division de los 2 valores 
     * @throws ArithmeticException contemplamos la division entre cero
     */ 
    public int dividir (int valor1, int valor2) throws ArithmeticException{
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
     * Llegan dos valores desde parametro, crea una variable tipo int donde se va a guardar el resto
     * @param valor1 primer valor
     * @param valor2 segundo valor
     * @return numero te devulve el resto de los 2 valores 
     */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}
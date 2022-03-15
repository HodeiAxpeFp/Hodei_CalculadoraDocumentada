package principal;
/**
 * @author Hodei Axpe
 */
import menu.Menu;
import operaciones.Operaciones;

public class Calculadora{
    public static void main(String[] args) {
    	/**
    	 * Esta parte del programa es el main donde vamos a llamar a los objetos
    	 * En el main se creara 2 objetos uno de Menu y de Operaciones tambien se crearan unas cuantas variables y una array de 2 posiciones
    	 * El main contine tambien una excepcion de tipo ArithmeticException
    	 */
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            try {
	            if (operacion.equalsIgnoreCase("+")){
	                resultado = operaciones.sumar(operandos[0], operandos[1]);
	                System.out.println ("Resultado: " + resultado);
	            } else if (operacion.equalsIgnoreCase("-")){
	                resultado = operaciones.restar(operandos[0], operandos[1]);
	                System.out.println ("Resultado: " + resultado);
	            } else if (operacion.equalsIgnoreCase("*")){
	                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
	                System.out.println ("Resultado: " + resultado);
	            } else if (operacion.equalsIgnoreCase("/")){
	                resultado = operaciones.dividir(operandos[0], operandos[1]);
	                System.out.println ("Resultado: " + resultado);
	            } else if (operacion.equalsIgnoreCase("%")){
	                resultado = operaciones.resto(operandos[0], operandos[1]);
	                System.out.println ("Resultado: " + resultado);
	            } else {
	                System.out.println ("Operación no válida");
	            }
	        } catch (ArithmeticException e) {
	        	System.out.println("Operacion aritmetica no valida "+e.getMessage());
	        }
            
        }   while (menu.repetir());
    }
}
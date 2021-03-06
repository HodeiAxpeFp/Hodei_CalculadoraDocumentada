package principal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import logs.FiltroLogSolo0;
import logs.FormatoHTML2;
/**
 * @author Hodei Axpe
 */
import menu.Menu;
import operaciones.Operaciones;

public class Calculadora {
	private static final Logger LOGGER = Logger.getLogger(Calculadora.class.getName());
	private static final LogManager logManager = LogManager.getLogManager();
	static {
		try {
			logManager.readConfiguration(new FileInputStream("./logs/configLog.properties"));
		} catch (IOException exception) {
			LOGGER.log(Level.SEVERE, "Error al cargar la configuración", exception);
		}
	}
	public static void main(String[] args) {
		/**
		 * Esta parte del programa es el main donde vamos a llamar a los objetos En el
		 * main se creara 2 objetos uno de Menu y de Operaciones tambien se crearan unas
		 * cuantas variables y una array de 2 posiciones El main contine tambien una
		 * excepcion de tipo ArithmeticException
		 */
		 
		 configurarLog();

		int resultado = 0;
		String operacion = "";
		int[] operandos = new int[2];

		Menu menu = new Menu();
		Operaciones operaciones = new Operaciones();

		do {
			operandos = menu.pedirNumeros();
			operacion = menu.menuOpciones();
			try {
				if (operacion.equalsIgnoreCase("+")) {
					resultado = operaciones.sumar(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
				} else if (operacion.equalsIgnoreCase("-")) {
					resultado = operaciones.restar(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
				} else if (operacion.equalsIgnoreCase("*")) {
					resultado = operaciones.multiplicar(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
				} else if (operacion.equalsIgnoreCase("/")) {
					resultado = operaciones.dividir(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
				} else if (operacion.equalsIgnoreCase("%")) {
					resultado = operaciones.resto(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
				} else {
					System.out.println("Operación no válida");
				}
				LOGGER.log(Level.FINE, "Operacion: " + operacion + " |operando1: " + operandos[0] + " |operando2: "
						+ operandos[1] + " |Resultado: " + resultado);
				} catch (ArithmeticException e) {
				System.out.println("Operacion aritmetica no valida " + e.getMessage());
				LOGGER.log(Level.WARNING, "Division entre cero.");
			}

		} while (menu.repetir());
	}

	public static void configurarLog() {

		Handler fileHandler = null;
		Handler consoleHandler = new ConsoleHandler();
		
		// Asignar handlers al objeto LOGGER
		LOGGER.addHandler(consoleHandler);
		
		try {
			fileHandler = new FileHandler("./logs/logOperacionesSolo0.html");
		} catch (IOException exception) {
			LOGGER.log(Level.SEVERE, "Ocurrio un error en FileHandler.", exception);
		}

		// Implementamos nuestro formateo de salida:
		fileHandler.setFormatter(new FormatoHTML2());
		
		// Asignar handlers al objeto LOGGER
		LOGGER.addHandler(fileHandler);
		// Establecer niveles a Handler y LOGGER
		consoleHandler.setLevel(Level.WARNING);
		fileHandler.setLevel(Level.FINE);

		// Establecer filtro en fileHandler
		fileHandler.setFilter(new FiltroLogSolo0());
		LOGGER.setLevel(Level.FINE);
	}
	
}
	
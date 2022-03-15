package menu;
import java.util.Scanner;
/**
 * 
 * @author Hodei Axpe
 *
 */
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    /**
     * Este metodo te pide 2 numeros y te los mete en la array que crea
     * @return ret te devuelve una array con 2 posiciones y con los numeros que has metido
     */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    /**
     * Te visualiza un menu de opciones en la cual tienes que elegir uno, si es incorrecta la eleccion te lo vuelve a preguntar hasta que sea correcta
     * @return ret Te devulve un String de la opcion que has elegido
     */
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    /**
     * Este metodo te da un par de opciones si quieres o no quieres salir del programa, si eliges mal te lo pregunta de nuevo  
     * @return ret Te devuelve un boolean
     */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("¿Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}
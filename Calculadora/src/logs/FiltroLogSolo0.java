package logs;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class FiltroLogSolo0 implements Filter {

	@Override
	public boolean isLoggable(LogRecord record) {
		boolean guardarLog = false;
		
		String[] array = record.getMessage().split(" ");
		int numero = Integer.parseInt(array[array.length-1]);
		if (numero == 0) {
		if (array[array.length-1].contains("0")){
			guardarLog = true;
			}
		}
			return guardarLog;
		
	}
	
	

}

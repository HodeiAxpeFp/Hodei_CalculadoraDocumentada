package logs;

import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class FormatoHTML2 extends Formatter {

	@Override
	public String format(LogRecord record) {
		
		String[] array = record.getMessage().split(" ");
		return "<tr><td> " + array[1] + "</td><td> "  + array[3] + "</td><td> " + array[5] + "</td><td> " + array[7] + "</td></tr>";
	}
	
	@Override
	public String getHead(Handler h) {
        return "<HTML>\n <head> \n <link rel='stylesheet' href='style.css'> <BODY> \n <table> \n <tr> \n <th>Operacion</th> \n <th>Operacion1</th> \n <th>Operacion2</th> \n <th>Resultado</th> \n </tr>" ;
    }
	
	@Override
    public String getTail(Handler h) {
        return "</table> \n </BODY>\n </head> \n </HTML> \n";
    }

}

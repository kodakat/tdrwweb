package tdrw;
import java.sql.Timestamp;
import java.util.Calendar;

import junit.framework.TestCase;


public class TestTdrwServlet extends TestCase {
	public void testTdrwServlet(){
		Timestamp sp = TdrwServlet.getToday();
		Calendar cal;
	}
	
}

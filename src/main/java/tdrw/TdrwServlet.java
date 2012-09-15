package tdrw;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TdrwServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2586500073153615420L;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String path = req.getPathInfo();
		PrintWriter out = res.getWriter();
		res.setContentType("text/text");
		out.write(path);

		String[] array = path.split("/");
		int[] commands = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			commands[i] = Integer.parseInt(array[i]);
		}

		if (commands.length == 1) {
			if (commands[0] < 1000) {
				Timestamp ts = getToday();
			}
		}
	}

	public static Timestamp getToday() {
		long currentTime = System.currentTimeMillis();
		long today = currentTime - currentTime % 86400000L;
		return new Timestamp(today);
	}
}
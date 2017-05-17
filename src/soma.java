
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/soma")
public class soma extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public soma() {
		super();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String x = request.getParameter("x");
		String y = request.getParameter("y");

		double soma = Double.parseDouble(x) + Double.parseDouble(y);
		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.print("<p>" + soma + "</p>");
		out.print("</body></html>");
	}

}

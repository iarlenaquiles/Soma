import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/oi")
public class Oi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Oi() {
		super();
	}

	 protected void service(HttpServletRequest request, HttpServletResponse
	 response)
	 throws ServletException, IOException {
		 System.out.println("service");
		 PrintWriter out = response.getWriter();
		 out.print("<html><body><h1>Olá, mundo! #Service</h1></body></html>");
	 }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		out.print("<html><body><h1>Olá, mundo!</h1>");
//		Enumeration<String> paramNames = request.getParameterNames();
//		while (paramNames.hasMoreElements()) {
//			String param = paramNames.nextElement();
//			String valor = request.getParameter(param);
//			out.println("<li>" + param + ": " + valor + "</li>");
//		}
//		out.print("</body></html>");
		
		System.out.println("doGet");
	}
	//
	// protected void doPost(HttpServletRequest request, HttpServletResponse
	// response)
	// throws ServletException, IOException {
	// doGet(request, response);
	// }

}

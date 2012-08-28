package poc.superbiz.org;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Na vers�o 3, existe a anota��o @WebServlet, 
 * que indica que aquela classe � uma Servlet. 
 * Essa anota��o recebe no seu par�metro value em qual URL a 
 * Servlet estar� dispon�vel.
 */

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final Writer writer = response.getWriter();
		writer.append("<html><body>");
		writer.append("<h1>Hello Servlet 3.0</h1>");
		writer.append("</html></body>");
	}

}

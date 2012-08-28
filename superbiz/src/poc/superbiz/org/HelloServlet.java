package poc.superbiz.org;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Na versão 3, existe a anotação @WebServlet, 
 * que indica que aquela classe é uma Servlet. 
 * Essa anotação recebe no seu parâmetro value em qual URL a 
 * Servlet estará disponível.
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

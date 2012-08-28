package poc.superbiz.org;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet 2.0 deve ser configurada via web.xml
 */

public class HelloServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    		
    		final Writer writer = response.getWriter();
    		writer.append("<html><body>");
    		writer.append("<h1>Hello Servlet 2.0</h1>");
    		writer.append("</html></body>");
    }
}

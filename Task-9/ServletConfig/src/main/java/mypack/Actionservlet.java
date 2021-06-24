package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Actionservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String website_name;

    /**
     * Default constructor. 
     */
    public Actionservlet() {
        // TODO Auto-generated constructor stub
    	super();
    }
    public void init(ServletConfig config) {
     website_name = config.getInitParameter("mywebsite");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
	    out.println("<html><body>");
	    out.println("<h1>"+website_name+"</h1>");
	    out.println("</body></html>");
	    out.close();
	}

}

package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FServlet")
public class FServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	 response.setContentType("text/html");
	 PrintWriter out = response.getWriter();
	 String name = request.getParameter("uname");
	 out.println("Welcome " + name);
	 Cookie ck = new Cookie("uname", name);  // creating object of cookie
	 response.addCookie(ck);   // adding cookie in the response.
	 out.println("<form action = 'SecondServlet' method ='post'>");
	 out.println("<input type = 'submit' value='Get your cookie'>");
	 out.println("</form>");
	 out.close();
	 
	 
	 
	 }
	
	

}

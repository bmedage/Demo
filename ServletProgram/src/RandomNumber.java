

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RandomNumber
 */
@WebServlet("/RandomNumber")
public class RandomNumber extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		   response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.print("<html>");
			out.print("<head>");
			out.print("<title>Message</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<H3 ALIGN='CENTER'>");
			out.print("Ramdom number from 0 to 10 :"); 
			out.print("<FONT COLOR='RED'>");
			out.print("<br>");
			out.println("Number 1::"+(int) (Math.random() * 10));
			out.print("<br>");
			
			out.println("Number 1::"+(int) (Math.random() * 10));
			out.print("<br>");
			out.println("Number 1::"+(int) (Math.random() * 10));
			out.print("<br>");
			out.print("</FONT>");
			out.print("</H3>");
			out.print("<H4 ALIGN='CENTER'>Refresh the page to changes the Number</H4>");
		
			out.print("</form>");
			out.print("</body>");
			
			out.print("</html>");
	}

}

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TablePrint extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String title = "Table";
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>" + title + "</title>");
	    out.println("</head>");
	    out.println("<body");

	    out.println("<center>");
	    out.println("<table border=1 cellpadding=0 cellspacing=0 width=70%>");
		for (int i = 1; i <= 25; i++) {

            out.println("<tr>");
            for (int j = 1; j <= 10; j++) {

                out.println("<td>" +"["+ i+"]["+ j+"]" + "</td>");
            }
            out.println("</tr>");
            System.out.println();
        }
		 out.println("</table>");
		 out.println("</body>");
		 out.println("</html>");
    }
		
	

}

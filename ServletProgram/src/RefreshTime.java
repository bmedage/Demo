

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RefreshTime
 */
@WebServlet("/RefreshTime")
public class RefreshTime extends HttpServlet {

	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
	      
	      response.setIntHeader("Refresh", 10);
	 
	      
	      response.setContentType("text/html");
	 
	      Calendar calendar = new GregorianCalendar();
	      String am_pm;
	      int hour = calendar.get(Calendar.HOUR);
	      int minute = calendar.get(Calendar.MINUTE);
	      int second = calendar.get(Calendar.SECOND);
	      
	      if(calendar.get(Calendar.AM_PM) == 0)
	        am_pm = "AM";
	      else
	        am_pm = "PM";
	 
	      String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
	    
	      PrintWriter out = response.getWriter();
	      String title = "Auto Page Refresh using Servlet";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	     
	      out.println(docType +
	         "<html>\n" +
	         "<head><title>" + title + "</title></head>\n"+
	         "<body bgcolor = \"#f0f0f0\">\n" +
	         "<h1 align = \"center\">" + title + "</h1>\n" +
	         "<FONT COLOR='RED'>"+
	         "<h2 align = \"center\" ><p>Current Time is: " + CT + "</p></h2>\n" +"</FONT>"
	      );
	    
	   }
	   
	   // Method to handle POST method request.
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
	      doGet(request, response);
	   }
	
}

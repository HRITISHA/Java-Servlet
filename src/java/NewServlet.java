import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.*;
/**
 * @author hriti
 */
public class NewServlet extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n=request.getParameter("user");
		String p=request.getParameter("pass");
		if(p.equals("servlet")){
			RequestDispatcher rd=request.getRequestDispatcher("Welcome2");
			rd.forward(request, response);
			
		}
		else{
			out.print("Sorry username or password error!");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Welcome2 extends HttpServlet {  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
        out.print("<body style='color:white;  background: linear-gradient(#141e30, #243b55);'>");
    String n=request.getParameter("user");  
        out.print("<center>");
        out.print("<h1 style='padding: 2%; font-size: 48px;'> Welcome "+n +" ! </h1>");  
   
        out.print("<form action='NewServlet1' method='get'>");  
        out.print("<input type='hidden' name='uname' value='"+n+"'>");   
       
        out.print(" <h2> ENTER THE CREDITS </h2> ");
        out.print("<label>Subject 1: No of Credits</label><input type='text' name='sub1'> <br>");
        out.print("<label>Subject 2: No of Credits</label><input type='text' name='sub2'><br> ");
        out.print("<label>Subject 3: No of Credits</label><input type='text' name='sub3'> <br>");
        out.print("<label>Subject 4: No of Credits</label><input type='text' name='sub4'><br> ");
        out.print("<label>Subject 5: No of Credits</label><input type='text' name='sub5'><br> ");
        out.print("<label>Subject 6: No of Credits</label><input type='text' name='sub6'><br> ");
        out.print("<label>Subject 7: No of Credits</label><input type='text' name='sub7'> ");
        out.print("<br> <br> <br>");
        out.print(" <h2> ENTER THE GRADES </h2> ");
        out.print("<label>Subject 1: Grade</label><input type='text' name='subb1'> <br>");
        out.print("<label>Subject 2: Grade</label><input type='text' name='subb2'><br> ");
        out.print("<label>Subject 3: Grade</label><input type='text' name='subb3'><br> ");
        out.print("<label>Subject 4: Grade</label><input type='text' name='subb4'><br> ");
        out.print("<label>Subject 5: Grade</label><input type='text' name='subb5'><br> ");
        out.print("<label>Subject 6: Grade</label><input type='text' name='subb6'><br> ");
        out.print("<label>Subject 7: Grade</label><input type='text' name='subb7'><br> ");
         out.print("<br>");
        
        
        out.print("<input type='submit' value='CALCULATE' style=' font-size: 20px; font-weight: bold; '>");  
         
        out.print("</form>");  
        out.print("</center>");
        
        out.close();  
    }  
  
} 
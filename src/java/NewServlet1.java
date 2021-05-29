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
import java.util.*;
/**
 *
 * @author hriti
 */
public class NewServlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
          String n=request.getParameter("uname");  
          
             String s1=request.getParameter("sub1");
             String s2=request.getParameter("sub2");
             String s3=request.getParameter("sub3");
             String s4=request.getParameter("sub1");
             String s5=request.getParameter("sub1");
             String s6=request.getParameter("sub1");
             String s7=request.getParameter("sub1");
             
             String g1=request.getParameter("subb1");
             String g2=request.getParameter("subb2");
            String g3=request.getParameter("subb3");
            String g4=request.getParameter("subb4");
            String g5=request.getParameter("subb5");
            String g6=request.getParameter("subb6");
            String g7=request.getParameter("subb7");
           
           List<Integer> credits = new ArrayList<>();
        credits.add(Integer.parseInt(s1));
        credits.add(Integer.parseInt(s2));
        credits.add(Integer.parseInt(s3));
        credits.add(Integer.parseInt(s4));
        credits.add(Integer.parseInt(s5));
        credits.add(Integer.parseInt(s6));
        credits.add(Integer.parseInt(s7));
        List<String> grades = new ArrayList<>();
        grades.add(g1);
        grades.add(g2);
        grades.add(g3);
        grades.add(g4);
        grades.add(g5);
        grades.add(g6);
        grades.add(g7);
        double sum = 0;
        for(int i=0;i<7;i++)
        {
            sum = sum + credits.get(i);
        }
        double score = 0;
        for(int i=0;i<7;i++)
        {
            if(grades.get(i).equals("S"))
            {
                int c = credits.get(i);
                score = score + c*10;
            }
            else if(grades.get(i).equals("A"))
            {
                int c = credits.get(i);
                score = score + c*9;
            }
            else if(grades.get(i).equals("B"))
            {
                int c = credits.get(i);
                score = score + c*8;
            }
            else if(grades.get(i).equals("C"))
            {
                int c = credits.get(i);
                score = score + c*7;
            }
            else if(grades.get(i).equals("D"))
            {
                int c = credits.get(i);
                score = score + c*6;
            }
            else if(grades.get(i).equals("E"))
            {
                int c = credits.get(i);
                score = score + c*5;
            }
            else if(grades.get(i).equals("F"))
            {
                int c = credits.get(i);
                score = score + c*0;
            }
        }
        double gpa = score/sum;
        String p="";
         if(gpa>9.5)
               p="Congratulations, Keep up the good work";
         else if(gpa>8.5 && gpa<9.5)
               p="Good Work";
         else 
             p="Work Hard";
        
        out.print("<center>");
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Calculation of grades</title>");            
            out.println("</head>");
            out.println("<body  style='color:white;  background: linear-gradient(#141e30, #243b55);'>");
            out.println("<h1 style='padding :4%;'>"+ n+ ", Your GPA is: "+ gpa+ "</h1>");
            out.println("<h1 style= 'font-style: italics;'>"+ p+ "</h1>");
            out.println("<img src='https://images.unsplash.com/photo-1570717173024-ec8081c8f8e9?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8bWFuJTIwd29ya2luZyUyMG9uJTIwY29tcHV0ZXJ8ZW58MHx8MHx8&ixlib=rb-1.2.1&w=1000&q=80' height=500px width=800px>");
            out.println("</body>");
            out.println("</html>");
            
               
        }
    }

}
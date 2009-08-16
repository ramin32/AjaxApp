package tk.raminrakhamimov;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

public class Add extends HttpServlet 
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        
        int first = Integer.parseInt(request.getParameter("first"));
        int second = Integer.parseInt(request.getParameter("second"));
        out.println(first + second);
        out.close();
    }
}

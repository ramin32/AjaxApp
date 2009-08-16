package tk.raminrakhamimov;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

public class Add extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException
    {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        
        int first = 0;
        int second = 0;
        try
        {
            first = Integer.parseInt(request.getParameter("first"));
            second = Integer.parseInt(request.getParameter("second"));
        }
        catch(Exception e){}

        out.println(first + second);
        out.close();
    }
}

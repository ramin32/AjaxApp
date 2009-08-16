package tk.raminrakhamimov;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

public class Hey extends HttpServlet 
{
    public void doGet (HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();

        out.println("Hello, world!");
        out.close();
    }
}

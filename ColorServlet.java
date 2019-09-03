import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ColorServlet extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse res) throws
ServletException, IOException
{
 String str = req.getParameter("color");
 res.setContentType("text/html");
 PrintWriter out = res.getWriter();
 out.println("<h1>");
 out.println("<b> Selected Color is");
 out.println(str);
 out.close();
}
}

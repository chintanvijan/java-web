import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class NewClass extends GenericServlet{
    public void service(ServletRequest request,ServletResponse response) throws IOException ,ServletException{
        String uname,pass;
        uname = request.getParameter("n1");
        pass = request.getParameter("n2");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html><body>username:"+uname+"<br>Password:"+pass+"</body></html>");
    }
}

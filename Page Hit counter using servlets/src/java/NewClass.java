import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class NewClass extends HttpServlet {
    private int counter;
    public void init(){
    counter=0;
    }
    
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        counter++;
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print("<html>"+counter+"</html>");
    } 
}

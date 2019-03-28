import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class NewClass1 extends HttpServlet{
    
     public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String[] fruits=new String[3];
        String[] vegetables=new String[3];
        fruits = request.getParameterValues("n1");
        vegetables = request.getParameterValues("n2");
        String f = request.getParameter("val");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        //out.println(f);
        for(int i=0;i<fruits.length;i++){
            out.print(fruits[i]+"<br>");
        }
        for(int i=0;i<vegetables.length;i++){
            out.print(vegetables[i]+"<br>");
        }
        out.print("</html>");
        
    }
    
}

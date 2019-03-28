import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class NewClass extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String[] fruits=new String[3];
        fruits = request.getParameterValues("n1");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<form action='NewClass1'>");
        for(int i=0;i<fruits.length;i++){
            out.print("<input type='text' name='n1' value='"+fruits[i]+"' />");
        }
        out.print("Select Vegetables");
        
        out.print("Onions<input type='checkbox' name='n2' value='Onions'/>");
        out.print("Tomatoes<input type='checkbox' name='n2' value='Tomatoes'/>");
        out.print("Potatoes<input type='checkbox' name='n2' value='Potatoes'/>");
        out.print("<input type='submit'/>");
        out.print("</fotm>");
        out.print("</html>");
        
    }
}

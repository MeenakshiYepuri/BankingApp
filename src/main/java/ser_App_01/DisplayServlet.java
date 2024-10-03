package ser_App_01;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/dis")
public class DisplayServlet implements Servlet 
	{
		@Override
		   public void init(ServletConfig scf)throws ServletException
		   {
			   
		   }
			@Override
		   public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
		   {
			   String EmpName=req.getParameter("ename");
			   String EmpCity=req.getParameter("ecity");
			   PrintWriter pw=res.getWriter();
			   res.setContentType("text/html");
			   pw.println("===empDetails===");
			   pw.println("<br>EmpName:"+EmpName);
			   pw.println("<br>EmpCity:"+EmpCity);
			   
			   
		   }
			@Override
		   public void destroy()
		   {
			   
		   }
			@Override
		   public String getServletInfo()
		   {
			   return " ";
		   }
			@Override
		   public ServletConfig getServletConfig()
		   {
			   return this.getServletConfig();
		   }
}

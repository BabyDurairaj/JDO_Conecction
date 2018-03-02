package full.JDO.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.Query;

public class LoginControl extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	
	{
		resp.setContentType("text/html");
		PrintWriter out1=resp.getWriter();
		String email1=req.getParameter("email");
		String password1=req.getParameter("password");
		req.getSession().setAttribute("email", email1);
		req.getSession().setAttribute("password",password1);
		Application ap=new Application();

		
        PersistenceManager pm = PMF.get().getPersistenceManager();
        

	     javax.jdo.Query q=pm.newQuery("SELECT from UserDetails where email=="+email1 + "&& password==" +password1);
			//List<UserDetails> list1=(List<UserDetails>)q.execute();
		RequestDispatcher rd=req.getRequestDispatcher("Welcome.jsp");
				rd.forward(req,resp);
			}
			
				
			}
		



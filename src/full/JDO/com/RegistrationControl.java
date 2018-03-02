package full.JDO.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class RegistrationControl extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
		resp.setContentType("text/plain");
		PrintWriter out = resp.getWriter();
		String email = req.getParameter("Email");
		String name=req.getParameter("Name");
		String password =req.getParameter("Password");
		String mobile =req.getParameter("Phone");
		
		UserDetails us= new UserDetails(email,name,password,mobile);
		

        PersistenceManager pm = PMF.get().getPersistenceManager();
         
		pm.makePersistent(us);
		
		Application app =new Application();
		req.getSession().setAttribute("email",email);
		req.getSession().setAttribute("name", name);
		req.getSession().setAttribute("password", password);
		req.getSession().setAttribute("mobile", mobile);
		
		RequestDispatcher rd=req.getRequestDispatcher("Welcome.jsp");
		rd.forward(req, resp);
		pm.close();
	}
}



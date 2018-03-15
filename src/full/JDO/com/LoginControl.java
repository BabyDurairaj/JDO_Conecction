package full.JDO.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.jdo.Query;

public class LoginControl extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException

	{
		resp.setContentType("text/html");
		PrintWriter out1 = resp.getWriter();
		String email1 = req.getParameter("email");
		String password1 = req.getParameter("password");
        HttpSession session=req.getSession();  

		session.setAttribute("email", email1);
		session.setAttribute("password", password1);

		PersistenceManager pm = PMF.get().getPersistenceManager();

		Query q = pm.newQuery("SELECT  from " + UserDetails.class.getName() + " where email =='" + email1
				+ "' && password== '" + password1 + "'");
		System.out.println("query : " + q.toString());

		System.out.println(q);
		List<UserDetails> list1 = (List<UserDetails>) q.execute();

		 Iterator itr=list1.iterator();
		 while(itr.hasNext())
		 {
			 UserDetails us3= (UserDetails)itr.next();
			 session.setAttribute("name",us3.getName() );
			 session.setAttribute("mobile",us3.getMobile());
		 }
		System.out.println("list1 : " + list1);

			RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
		rd.forward(req, resp);
	}

}

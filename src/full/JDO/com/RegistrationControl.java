package full.JDO.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpSession;
import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.google.appengine.api.blobstore.BlobstoreServicePb.BlobstoreService;

public class RegistrationControl extends HttpServlet {
	

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		String email = req.getParameter("Email");
		String name = req.getParameter("Name");
		String password = req.getParameter("Password");
		String mobile = req.getParameter("Phone");

		UserDetails us = new UserDetails(email, name, password, mobile);

		PersistenceManager pm = PMF.get().getPersistenceManager();

		pm.makePersistent(us);

		HttpSession session = req.getSession();

		Application app = new Application();
		session.setAttribute("email", email);
		session.setAttribute("name", name);
		session.setAttribute("password", password);
		session.setAttribute("mobile", mobile);

		RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
		rd.forward(req, resp);
		pm.close();
	}
}

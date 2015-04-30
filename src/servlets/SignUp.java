package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.connect.Service;
//import com.connect.ServiceProxy;


/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//ServiceProxy proxy=new ServiceProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int qDone;
		try
		{
			String firstname = request.getParameter("firstname");
			String lastname = request.getParameter("lastname");
			String emailid = request.getParameter("emailid");
			String password = request.getParameter("password");
			//proxy.setEndpoint("http://localhost:8080/Email-2-SMS/services/Service");
			//qDone = proxy.signUp(firstname, lastname, emailid, password);
			HttpSession session = request.getSession();
			//if(qDone>0)
			{
				session.setAttribute("userSession", session);
				//response.sendRedirect("Regis.jsp");
				out.println("success reg");
			}
			//else{
				out.println("Fail");
				//response.sendRedirect("RegisError.jsp");
			//}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//response.sendRedirect("RegisError.jsp");
			
		}
	}
}

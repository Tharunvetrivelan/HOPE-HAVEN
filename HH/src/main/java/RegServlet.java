

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.RequestDispatcher;


/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fullname=request.getParameter("fullname");
		String email1=request.getParameter("email1");
		String phone_no1=request.getParameter("phone_no1");
		String dob=request.getParameter("dob");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String interest=request.getParameter("interest");
		System.out.println(fullname);
		System.out.println(email1);
		System.out.println(phone_no1);
		System.out.println(dob);
		System.out.println(username);
		System.out.println(password);
		System.out.println(address);
		System.out.println(interest);

		        RegDb db=new RegDb(fullname,email1,phone_no1,dob,username,password,address,interest);
		        if(db.store()) {
		        RequestDispatcher req=request.getRequestDispatcher("index1.jsp");
		            req.forward(request, response);
		        }
		        else {
			       RequestDispatcher req=request.getRequestDispatcher("index.jsp");
			       req.forward(request, response);
		        }

		doGet(request, response);
	}

}

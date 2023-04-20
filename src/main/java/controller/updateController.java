package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.PeopleInfoBo;
import com.dao.ThingDao;

/**
 * Servlet implementation class updateController
 */
@WebServlet("/updateController")
public class updateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		String fullName=request.getParameter("fullName");
		String email=request.getParameter("email");
		String dob=request.getParameter("dob");
		String phone=request.getParameter("phone");
		String things_to_do=request.getParameter("things_to_do");
		String idType=request.getParameter("idType");
		String idNumber=request.getParameter("idNumber");
		
		PeopleInfoBo sb=new PeopleInfoBo( id, fullName, email, dob, phone, things_to_do, idType, idNumber);
		
		int status=ThingDao.updatePeople(sb);
		
		if(status>0)
		{
			pw.print("<script>alert('Your data has been updated succesfully')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("AllPeopleDataController");
			rd.include(request, response);
			
			
			
			
			
		}
		
		else
		{
			pw.print("<script>alert('Something went erong')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("AllPeopleDataController");
			rd.include(request, response);
			
			
		}
	}

}

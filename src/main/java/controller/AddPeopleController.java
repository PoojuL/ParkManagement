package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.PeopleInfoBo;
import com.dao.ThingDao;

/**
 * Servlet implementation class AddPeopleController
 */
@WebServlet("/AddPeopleController")
public class AddPeopleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddPeopleController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubresponse.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
		String fullName=request.getParameter("fullName");
		String email=request.getParameter("email");
		String dob=request.getParameter("dob");
		String phone=request.getParameter("phone");
		String things_to_do=request.getParameter("things_to_do");
		String idType=request.getParameter("idType");
		String idNumber=request.getParameter("idNumber");
		
		PeopleInfoBo sb=new PeopleInfoBo( fullName, email, dob, phone, things_to_do, idType, idNumber);
		
		int status=ThingDao.addPeople(sb);
		
		if(status>0)
		{
			
			pw.print("Your data is inserted");
			
		}
		else
		{
			
			pw.print("Data not inserted");
		}
	}

}

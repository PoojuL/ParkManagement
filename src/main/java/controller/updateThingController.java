package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.ThingInfoBo;
import com.dao.ThingDao;

/**
 * Servlet implementation class updateThingController
 */
@WebServlet("/updateThingController")
public class updateThingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateThingController() {
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
		
		String thingName=request.getParameter("thingName");
		String companyName=request.getParameter("companyName");
		String thingId=request.getParameter("thingId");
		
		
		ThingInfoBo bb=new ThingInfoBo( id, thingName, companyName, thingId);
		
		int status=ThingDao.updateThing(bb);
		
		if(status>0)
		{
			pw.print("<script>alert('Your data has been updated succesfully')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("AllThingDataController");
			rd.include(request, response);	
			
		}
		
		else
		{
			pw.print("<script>alert('Something went erong')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("AllThingDataController");
			rd.include(request, response);
			
			
		}
	}

}

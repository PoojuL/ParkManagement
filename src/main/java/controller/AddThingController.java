package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.ThingInfoBo;
import com.dao.ThingDao;

/**
 * Servlet implementation class AddThingController
 * @param <RequestDispatcher>
 */
@WebServlet("/AddThingController")
public class AddThingController<RequestDispatcher> extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddThingController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
         response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
		String thingName=request.getParameter("thingName");
		String companyName=request.getParameter("companyName");
		String thingId=request.getParameter("thingId");
		
		ThingInfoBo  bb=new ThingInfoBo(thingName, companyName, thingId);
		
		int status=ThingDao.addthing(bb);
		
		if(status>0)
		{
			
			pw.print("<script>alert('Your data is inserted')</script>");
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
			rd.forward(request, response);
			
		}
		else
		{
			
			pw.print("<script>alert('Data not inserted')</script>");
			javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
			rd.forward(request, response);
		}	
		
	}
}


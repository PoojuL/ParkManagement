package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.ThingInfoBo;
import com.dao.ThingDao;

/**
 * Servlet implementation class EditServlet2Thing
 */
@WebServlet("/EditServlet2Thing")
public class EditServlet2Thing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet2Thing() {
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
		
		ThingInfoBo bb=ThingDao.getInfoByIdThing(id);
		
		pw.print("<form  action='updteThingController' method='get'> ");
	    
		pw.print("<table>");
		
		pw.print("<tr><td></td><td><input type='hidden' name='id' value='"+bb.getId()+"'/></td></tr>");  
		pw.print("<tr><td>ThingName: </td> <td><input type='text' name='thingName' value='"+bb.getThingName()+"'/></td></tr>");
	   	pw.print("<tr><td>CompanyName: </td> <td><input type='text' name='companyName' value='"+bb.getCompanyName()+"'/></td></tr>");
	   	pw.print("<tr><td>ThingId:</td> <td><input type='text' name='thingId' value='"+bb.getThingId()+"'/></td></tr>");
	  
	    pw.print("<tr><td><input type='submit' value='Update'></td></tr>"); 
	    
	   	pw.print("</table>");
		
		pw.print("</form>");
	}

}

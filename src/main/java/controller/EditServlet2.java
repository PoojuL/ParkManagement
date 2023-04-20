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
 * Servlet implementation class EditServlet2
 */
@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet2() {
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
	
	PeopleInfoBo sb=ThingDao.getInfoById(id);
	
	pw.print("<form  action='updateController' method='get'> ");
    
	pw.print("<table>");
	
	pw.print("<tr><td></td><td><input type='hidden' name='id' value='"+sb.getId()+"'/></td></tr>");  
	pw.print("<tr><td>Name: </td> <td><input type='text' name='fullName' value='"+sb.getFullName()+"'/></td></tr>");
   	pw.print("<tr><td>Email: </td> <td><input type='text' name='email' value='"+sb.getEmail()+"'/></td></tr>");
   	pw.print("<tr><td>Dob:</td> <td><input type='date' name='dob' value='"+sb.getDob()+"'/></td></tr>");
   	pw.print("<tr><td>Phone : </td> <td><input type='text' name='phone' value='"+sb.getPhone()+"'/></td></tr>");
   	pw.print("<tr><td>Things_to_do: </td> <td> <select name =\"things_to_do\">\r\n"
   			+ "          \r\n"
   			+ "          <option value=\"Parking\" <% if (sb.getThings_to_do().equals(\"Parking\"))  %>Parking</option>\r\n"
   			+ "				<option value=\"Food_tasting\" <% if (sb.getThings_to_do().equals(\"Food_tasting\"))  %>  >Food_tasting</option>\r\n"
   			+ "				<option value=\"Exercise\" <% if (sb.getThings_to_do().equals(\"Exercise\"))  %> >Exercise</option>\r\n"
   			+ "				<option value=\"Playground\" <% if (sb.getThings_to_do().equals(\"Playground\"))  %> >Playground</option>\r\n"
   			
   			+ "             \r\n"
   			+ "\r\n"
   			+ "\r\n"
   			+ "        </select></td></tr>");
   	pw.print("<tr><td>IdType: </td> <td><input type='text' name='idType' value='"+sb.getIdType()+"'/></td></tr>");
   	pw.print("<tr><td>IdNumber </td> <td><input type='text' name='idNumber' value='"+sb.getIdNumber()+"'/></td></tr>");
    pw.print("<tr><td><input type='submit' value='Update'></td></tr>"); 
    
   	pw.print("</table>");
	
	pw.print("</form>");
	
	
	
}

}

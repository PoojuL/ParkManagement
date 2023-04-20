package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.PeopleInfoBo;
import com.dao.ThingDao;

/**
 * Servlet implementation class AllPeopleDataController
 */
@WebServlet("/AllPeopleDataController")
public class AllPeopleDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllPeopleDataController() {
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
		pw.print("<script src='https://kit.fontawesome.com/a076d05399.js'crossorigin='anonymous'></script>");
		pw.print("<link rel=\"stylesheet\" href=\"css/style.css\">");
		
		List<PeopleInfoBo> list=ThingDao.getPeopleData();
		
		pw.print("<table border='1px solid black'; width ='100%'> ");
		
		pw.print("<tr><th>  Id</th><th> fullName</th><th> email</th><th>  dob</th><th> phone</th><th> thing_to_do</th><th>  idType</th><th>  idNumber</th><th>  Edit</th><th>  Delete</th></tr>"); //<th>  Actions</th>
		
		for(PeopleInfoBo sb:list)
			
			//pw.print("<tr><td>"+sb.getId()+"</td><td>"+sb.getFullName()+"</td><td>"+sb.getEmail()+"</td><td>"+sb.getDob()+"</td><td>"+sb.getPhone()+"</td><td>"+sb.getSubject()+"</td><td>"+sb.getIdType()+"</td><td>"+sb.getIdNumber()+"</td></tr>");
	
		pw.print("<tr><td>"+sb.getId()+"</td><td>"+sb.getFullName()+"</td><td>"+sb.getEmail()+"</td><td>"+sb.getDob()+"</td><td>"+sb.getPhone()+"</td><td>"+sb.getThings_to_do()+"</td><td>"+sb.getIdType()+"</td><td>"+sb.getIdNumber()+"</td><td>"+"<a href='EditServlet2?id="+sb.getId()+"'> <i class=\"fas fa-edit\" style=\" color:blue;\"></i> </a> </td> <td><a href='DeleteServlet?id="+sb.getId()+"'><i class=\"fas fa-trash-alt\" style=\" color:red;\"></i> </a></td></tr>");
		//pw.print("</table>");  //  
		pw.print("</table>");
	}
	}



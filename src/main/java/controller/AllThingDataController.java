package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.ThingInfoBo;
import com.dao.ThingDao;

/**
 * Servlet implementation class allthingdatacontroller
 */
@WebServlet("/allthingdatacontroller")
public class AllThingDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllThingDataController() {
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
		
		
		List<ThingInfoBo> list=ThingDao.getThingData();
		
		pw.print("<table border='1px solid black'; width ='100%'>");
        pw.print("<tr><th> id</th><th> thingName</th><th> companyName</th><th> thingId</th><th>  Edit</th><th>  Delete</th></tr>"); //<th>  Actions</th>
		
		for(ThingInfoBo bb:list)
		{
			pw.print("<tr><td>"+bb.getId()+"</td><td>"+bb.getThingName()+"</td><td>"+bb.getCompanyName()+"</td><td>"+bb.getThingId()+"</td><td>"+"<a href='EditServlet2Thing?id="+bb.getId()+"'> <i class='fas fa-edit'></i> </a>  </td> <td><a href='DeleteServletThing?id="+bb.getId()+"'><i class=\"fas fa-trash-alt\" style=\" color:red; \"></i> </a></td></tr>");
			
			
		}
			
		
		pw.print("</table>");
	}
	}



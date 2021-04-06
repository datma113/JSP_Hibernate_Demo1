package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDao;
import entity.Person;
@WebServlet (urlPatterns = {"/person/*"})
public class PersonController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PersonDao personDao = new PersonDao();
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        response.setContentType("text/html;charset=UTF-8");
			        request.setCharacterEncoding("utf-8");
			        doGet(request, response);
			    }
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String action = getAction(uri);
		
		switch (action) {
		case "/person/save":
			savePerson(req, resp);
			break;
		case "/person/add":
			showFormAdd(req, resp);
			break;
		default:
			break;
		}
		
	}

	private void showFormAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/formAddPerson.jsp");
		dispatcher.forward(req, resp);   
	}

	private void savePerson(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String id = req.getParameter("id");
		String fullname = req.getParameter("fullname");
		String gmail = req.getParameter("gmail");
		Person person = new Person(id, fullname, gmail);
		personDao.addPerson(person);
		
		resp.sendRedirect("index.jsp");	
	}

	private String getAction(String uri) {
		String[] temp = uri.split("person");
		return "/person".concat(temp[temp.length-1]);
	}

}

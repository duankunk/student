package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.bcel.internal.generic.Select;

@WebServlet("/index")
public class tjdd extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//·ÀÖ¹ÂÒÂë
		req.setCharacterEncoding("UTF-8");
		service.Select s = new service.Select();
		req.getSession().setAttribute("stus", s.all());
		resp.sendRedirect("index.jsp");
		/*
		 * req.setAttribute("stus", s.all());
		 * req.getRequestDispatcher("/index.jsp").forward(req, resp);
		 */
	}
	
}
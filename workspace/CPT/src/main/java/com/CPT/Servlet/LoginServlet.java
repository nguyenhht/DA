package com.CPT.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.CPT.DB.DBConnect;
import com.CPT.Dao.NguoiDungDaoImpl;
import com.CPT.Entities.NguoiDung;


@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String email = req.getParameter("txtemail");
		String password = req.getParameter("txtpassword");
		
		
		HttpSession session = req.getSession();
		
		
		
	    
	}



	
	
}

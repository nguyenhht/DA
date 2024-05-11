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
		String role = "";
		if(email.equals("tungta@gmail.com")) {
			role = "admin";
		}else {
			role = "user";
		}
		
		
		if(role.equals("admin")) {
			session.setAttribute("fMsg", role);
			resp.sendRedirect("admin/homeAdmin.jsp");
		}else if (role.equals("user")) {
			session.setAttribute("fMsg", role);
			resp.sendRedirect("index.jsp");
		}
		else {
			session.setAttribute("fMsg", "tài hoản mật khẩu sai");
			resp.sendRedirect("login.jsp");
		}
		
//		NguoiDung nds = authenticate(email, password);
//	    if (nds != null && nds.getVaiTro() != null && nds.getVaiTro().getTenVaiTro().equals("1")) {
//	        session.setAttribute("fMsg", nds);
//	        resp.sendRedirect("admin/homeAdmin.jsp");
//	    } else {
//	        if (nds != null) {
//	            session.setAttribute("fMsg", nds);
//	            resp.sendRedirect("index.jsp");
//	        } else {
//	            session.setAttribute("fMsg", "");
//	            resp.sendRedirect("login.jsp");
//	        }
//	    }
	    
	}

//	private NguoiDung authenticate(String email, String password) {
//		NguoiDungDaoImpl udi = new NguoiDungDaoImpl(DBConnect.getConnect());
//		NguoiDung nds = udi.findByEmail(email);
//		
//		if (nds != null && nds.getEmail().equals(email)) {
//		    return nds; 
//		} else {
//		    return null; 
//		}
//	}

	
	
}
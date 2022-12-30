package com.game;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInsert")
public class UserInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String mobilenumber = request.getParameter("mobilenumber");
		String gender = request.getParameter("gender");
		String dob = request.getParameter("dob");
		String psw = request.getParameter("psw");
		
		boolean isTrue;
		
		isTrue = UserDBUtil.insertUser(username, firstname, lastname, email, mobilenumber, gender, dob, psw);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("UserSuccess.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("UserUnsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}

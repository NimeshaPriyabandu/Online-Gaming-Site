package com.game;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateGameServelet")
public class UpdateGameServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("gameId");
		String name = request.getParameter("name");
		String des = request.getParameter("description");
		String price = request.getParameter("price");
		
		boolean isTrue;
		isTrue = GameDBUtil.updateGame(id, name, des, price);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("UpdateSuccess.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("UpdateUnsuccess.jsp");
			dis.forward(request, response);
		}
	}

}

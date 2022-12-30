package com.game;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GameInsert")
public class GameInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//insert game
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("gamename");
		String des = request.getParameter("description");
		String price = request.getParameter("price");
		
		boolean isTrue = GameDBUtil.insertGame(name, des, price);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("GameSuccess.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("GameUnsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}

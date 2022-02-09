package com.lol.suggestion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lol.signup.AccountDAO;


@WebServlet("/SuggestionDelController")
public class SuggestionDelController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AccountDAO.loginCheck(request);
		SuggestionDAO.getDdao().getDuo(request);
		SuggestionDAO.getDdao().getAllDuo(request);
		SuggestionDAO.getDdao().paging(1, request);
		request.setAttribute("contentPage", "suggestion_delete.jsp");
		request.getRequestDispatcher("suggestion/suggestion.jsp").forward(request, response);
	}	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		AccountDAO.loginCheck(request);
		SuggestionDAO.getDdao().getDuo(request);
		SuggestionDAO.getDdao().deleteDuo(request);
		SuggestionDAO.getDdao().getAllDuo(request);
		SuggestionDAO.getDdao().paging(1, request);
		request.setAttribute("contentPage", "suggestion_home.jsp");
		request.getRequestDispatcher("suggestion/suggestion.jsp").forward(request, response);
	
	}
		
		
}


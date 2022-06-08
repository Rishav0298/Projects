package org.rish.myWebPrj;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns="AddServlet") //we do not need xml config file web.xml
@EJB
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddServlet() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Inside init");
	}

	
	public void destroy() {
		System.out.println("Destroying");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Inside Service");
		
		MySessionBean mySessionBean = null;
		
		int i = Integer.parseInt(request.getParameter("n1"));
		int j = Integer.parseInt(request.getParameter("n2"));
		
		mySessionBean.setI(i);
		mySessionBean.setJ(j);
		
		mySessionBean.add();
		
		PrintWriter out = response.getWriter();
		
		out.print("adding from Session Bean: "+mySessionBean.getK());
		
		
		
		
//		int k=i+j;
//		
//		Cookie cookie= new Cookie("k",k+"");
//		response.addCookie(cookie);
//		response.sendRedirect("SqServlet");
		
		
	}

}

package org.rish.myWebPrj;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.tomcat.util.http.parser.Cookie;


public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SqServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		int k = (int)request.getAttribute("k");
//		
//		k = k*k;
//		System.out.println("In sqr - doGet method");
		
		int k =0;
		
//		Cookie cookies[] = request.getCookies();
//		
//		for(Cookie c : cookies) {
//			if(c.getName().equals("k")) {
//				k=Integer.parseInt(c.getValue());
//			}
//		}
		
		k=k*k;
		PrintWriter out = response.getWriter();
		out.print(k);
	}

}

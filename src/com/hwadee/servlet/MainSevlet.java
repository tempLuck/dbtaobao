package com.hwadee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/mainservlet.html")
public class MainSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public MainSevlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   HttpSession session=	request.getSession();
	   //��֤��¼�Ƿ�ɹ�
	   if(session.getAttribute("LOGINSTATE")==null) {
		   //û�е�¼���ߵ�¼ʧЧ��������¼ҳ
		   response.sendRedirect(request.getContextPath()+ "/login.html");
		   return;
	   }
	   else {
		response.setCharacterEncoding("utf-8");
		response.sendRedirect(request.getContextPath()+ "/index.jsp");
	   }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

/*
 * 	프로젝트(Project): 회원가입(Session - 세션)
 * 	파일명(File): FrontController.java
 * 	생성일자(Create Date): 2020-09-25
 * 	저자(Author): Dodo / rabbit.white at daum dot net
 * 	설명(Description): 
 * 	1. FrontController와 Command 패턴이 구현 핵심이다.
 * 
 */
package com.member.web.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String charset = null;
       
    public FrontController() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doAction(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	
	protected void doAction(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		ServletConfig sc = this.getServletConfig();
		charset = sc.getInitParameter("charset");

		req.setAttribute("charset", charset);
		req.setCharacterEncoding(charset);
		res.setContentType("text/html; charset=" + charset);

		String uri = req.getRequestURI();
		String conPath = req.getContextPath();
		String command = uri.substring(conPath.length());
		Controller subController = null;

		if(command.equals("/member/login.do")){
			
			System.out.println("login");
			System.out.println("----------------");

			subController = new MemberLoginController();
	    	subController.execute(req, res);

		}else if (command.equals("/member/process.do")) {
			
			System.out.println("process");
			System.out.println("----------------");

			subController = new MemberProcessController();
	    	subController.execute(req, res);
	    	
		}else if (command.equals("/member/logon.do")) {
			
			System.out.println("logon");
			System.out.println("----------------");
			
			subController = new MemberLogonController();
	    	subController.execute(req, res);
			
		}else if (command.equals("/member/logout.do")) {
			
			System.out.println("logout");
			System.out.println("----------------");
			
			subController = new MemberLogoutController();
	    	subController.execute(req, res);
	    	
		}else if (command.equals("/member/sessionAllKill.do")) {

			System.out.println("sessionAllKill");
			System.out.println("----------------");
			
			subController = new MemberSessionAllKillController();
	    	subController.execute(req, res);
	    	
		}else if (command.equals("/member/errorAlert.do")) {

			System.out.println("errorAlert");
			System.out.println("----------------");
			
			subController = new MemberErrorAlertController();
	    	subController.execute(req, res);
			
		}
		
		// end of if
		
		
	}

}

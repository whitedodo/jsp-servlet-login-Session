/*
 * 	프로젝트(Project): 회원가입(Session - 세션)
 * 	파일명(File): MemberLogoutController.java
 * 	생성일자(Create Date): 2020-09-25
 * 	저자(Author): Dodo / rabbit.white at daum dot net
 * 	설명(Description): 
 * 	1. JSP/Servlet으로 구현한 특정 세션 제거
 * 
 */
package com.member.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberLogoutController implements Controller {

	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession session = req.getSession();
		
		String userID = (String)session.getAttribute("userID");
		
		// 세션이 존재할 때
		if ( userID != null ) {
			session.removeAttribute("userID");
			session.removeAttribute("userName");
			
			System.out.println("세션 존재: 삭제완료");
			
			res.sendRedirect("login.do");
		}
		
	}

}

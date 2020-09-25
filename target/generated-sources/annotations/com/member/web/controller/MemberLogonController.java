/*
 * 	프로젝트(Project): 회원가입(Session - 세션)
 * 	파일명(File): MemberLogonController.java
 * 	생성일자(Create Date): 2020-09-25
 * 	저자(Author): Dodo / rabbit.white at daum dot net
 * 	설명(Description): 
 * 	1. JSP/Servlet으로 구현한 세션 존재 여부
 * 
 */

package com.member.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberLogonController implements Controller {

	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession session = req.getSession();
		
		String userID = (String) session.getAttribute("userID");
		
		// 세션이 존재할 때
		if ( userID != null )
		{
			System.out.println("세션 존재 - 로그인");
			HttpUtil.forward(req, res, "/WEB-INF/views/member/logon.jsp");
		}
		else {
			System.out.println("세션 없음.");

			session.setAttribute("member_error_msg", "로그인 상태를 확인해주세요.");
			session.setAttribute("member_redirect_url", "login.do");
			
			res.sendRedirect("errorAlert.do");
			
		} // end of if
		
	}

}

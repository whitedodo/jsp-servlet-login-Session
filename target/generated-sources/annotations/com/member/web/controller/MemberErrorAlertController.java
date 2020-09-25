/*
 * 	프로젝트(Project): 회원가입(Session - 세션)
 * 	파일명(File): MemberErrorAlertController.java
 * 	생성일자(Create Date): 2020-09-25
 * 	저자(Author): Dodo / rabbit.white at daum dot net
 * 	설명(Description): 
 * 	1. JSP/Servlet으로 구현한 세션 - 에러메시지 동작시키기
 * 
 */
package com.member.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberErrorAlertController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpUtil.forward(req, res, "/WEB-INF/views/member/error_alert.jsp");
		HttpSession session = req.getSession();
		session.invalidate();
		
	}

}

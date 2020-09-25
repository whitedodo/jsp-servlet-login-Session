/*
 * 	프로젝트(Project): 회원가입(Session - 세션)
 * 	파일명(File): HttpUtil.java
 * 	생성일자(Create Date): 2020-09-25
 * 	저자(Author): Dodo / rabbit.white at daum dot net
 * 	설명(Description): 
 * 	1. RequestDispatcher, forward 기법이 핵심이다.
 * 	2. res.sendRedirect(), forward 방식 두 가지로 구성된다.
 */
package com.member.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpUtil extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static String charset = null;

	public static void forward(HttpServletRequest req, HttpServletResponse res,
			String path) throws ServletException, IOException {
			
		try {

			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			dispatcher.forward(req, res);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
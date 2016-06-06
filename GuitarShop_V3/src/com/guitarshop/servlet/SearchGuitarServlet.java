package com.guitarshop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guitarshop.dao.DaoFactory;
import com.guitarshop.dao.IGuitarDao;

/**
 * 处理 搜索吉他的请求
 * 
 * @author gyt
 */
@WebServlet("/SearchGuitarServlet")
public class SearchGuitarServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchGuitarServlet()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub

		IGuitarDao guitardao = DaoFactory.createGuitarDao();

		request.setAttribute("list", guitardao.searchGuitar());
		System.out.println(guitardao.searchGuitar());// 测试是否取到list对象
		request.getRequestDispatcher("results.jsp").forward(request, response);
	}

}

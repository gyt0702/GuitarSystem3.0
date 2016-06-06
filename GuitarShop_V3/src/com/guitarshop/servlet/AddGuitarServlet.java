package com.guitarshop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guitarshop.dao.DaoFactory;
import com.guitarshop.dao.IGuitarDao;
import com.guitarshop.domain.Guitar;
import com.guitarshop.domain.GuitarSpec;

/**
 * 添加 新吉他的action类
 * 
 * @author gyt
 */
@WebServlet("/AddGuitarServlet")
public class AddGuitarServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddGuitarServlet()
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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		IGuitarDao guitardao = DaoFactory.createGuitarDao();

		Guitar guitar = new Guitar();
		GuitarSpec guitarspec = new GuitarSpec();
		String serialNumber = request.getParameter("serialNumber");
		Double price = Double.parseDouble(request.getParameter("price"));
		String builder = request.getParameter("builder");
		String model = request.getParameter("model");
		String type = request.getParameter("type");
		String backWood = request.getParameter("backWood");
		String topWood = request.getParameter("topWood");

		System.out.println(builder);// 测试是否取到值
		System.out.println(type);// 测试是否取到值
		System.out.println(price);// 测试是否取到值

		guitar.setSerialNumber(serialNumber);
		guitar.setPrice(price);
		guitarspec.setBuilder(builder);
		guitarspec.setModel(model);
		guitarspec.setType(type);
		guitarspec.setBackWood(backWood);
		guitarspec.setTopWood(topWood);
		guitar.setSpec(guitarspec);

		guitardao.addGuitar(guitar);
		request.getRequestDispatcher("success.jsp").forward(request, response);

	}

}

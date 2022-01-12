package study.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.Manager.HibernateManager;
import study.entity.AddressEntity;


@WebServlet("/AddCustomerInfo")
public class AddCustomerInfo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String fname=request.getParameter("firstName");
		String lastname=request.getParameter("lastName");
		String address=request.getParameter("address");
		HibernateManager dao=new HibernateManager();
		dao.addIntoCustomer(fname,lastname,address);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}

package com.admin1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class product
 */
@WebServlet("/product")
public class product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String url= "jdbc:mysql://localhost:3306/products"; // table details
    String username = "root"; // MySQL credentials
    String password = "Pintu@143";
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, username, password);
		 PreparedStatement ps=con.prepareStatement("insert into iteams(id,name,description,price,userid,type,imagename) values (?,?,?,?,?,?,?)") ;
		 String productid=request.getParameter("productid");
		 String name=request.getParameter("productname");
		 String description=request.getParameter("productdes");
		 String price=request.getParameter("price");
		 String userid=request.getParameter("userid");
		 String type=request.getParameter("type");
		 String imagename=request.getParameter("image");
		 float price1=Float.parseFloat(price);  
		 ps.setString(1, productid);
		 ps.setString(2, name);
		 ps.setString(3, description);
		 ps.setFloat(4, price1);
		 ps.setString(5, userid);
		 ps.setString(6, type);
		 ps.setString(7, imagename);
//		 String fileName=extractFileName(part);
//		 String savepath="C:\\Users\\Padmanav\\eclipse-workspace\\admin1\\src\\main\\webapp\\image\\"+File.separator+fileName;
//		 File filesavedir= new File(savepath);
		 
		 
//		 FileInputStream fis=new FileInputStream("C:\\Users\\Padmanav\\eclipse-workspace\\admin1\\src\\main\\webapp\\image\\test.jpeg");
//		 ps.setBinaryStream(2, fis,fis.available());
//		 ps.setString(1, password);
//		 ps.setString(2, savepath);
	     ps.execute();
	     System.out.println("Added sucessfully");
		} 
    catch (Exception e) {
		
		e.printStackTrace();
	}
    
    
	}
}

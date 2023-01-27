package bean;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getproducts
 */
@WebServlet("/getproducts")
public class getproducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getproducts() {
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
		// TODO Auto-generated method stub
		Connection con = ConnectionProvider.getCon();
        PreparedStatement st;
		try {
			st = con.prepareStatement("SELECT * FROM products");
			ResultSet rs = st.executeQuery();
			ArrayList<productdetails> products=new ArrayList<>();
			productdetails p=new productdetails();
			while(rs.next())
			{
				p.setId(rs.getString(1));
				p.setName(rs.getString(2));
				p.setDescripation(rs.getString(3));
				p.setUserid(rs.getString(5));
				p.setType(rs.getString(6));
				p.setImagename(rs.getString(7));
				p.setPrice(rs.getFloat(4));
				products.add(p);
			}
			request.setAttribute("product", products);
			request.getRequestDispatcher("avalableproducts.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	}

}

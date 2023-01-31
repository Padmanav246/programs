package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class printcart {
	ArrayList<String> cart = new ArrayList<>();
	public ArrayList<String> printcart2(String Userid) {
		System.out.println("inside printcart");
		Connection con = ConnectionProvider.getCon();
		System.out.println("inside printcart");
		
		System.out.println("inside printcart");
		try {
			PreparedStatement st1 = con.prepareStatement("SELECT * from ordered where userid=?");
			st1.setString(1,Userid);
			ResultSet rs = st1.executeQuery();
			System.out.println("inside printcart");

			while (rs.next()) {
				System.out.println("inside printcart");
				cart.add(rs.getString(2));
				System.out.println(rs.getString(2));
				System.out.println("printcart");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cart;

	}
}

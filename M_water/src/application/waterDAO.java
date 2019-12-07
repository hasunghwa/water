package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class waterDAO {
	public ObservableList<waterV> loadProduct(String sort,String search) throws IOException, SQLException {

		String sql = "select * from ingredient ORDER BY "+sort;

		Connection con = ConnectionUtil.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		ArrayList<waterV> waterList = new ArrayList<>();
		ObservableList<waterV> waterObList = FXCollections.observableArrayList();
		
		if(search.equals("")) {
			while (rs.next()) {
				waterV productvo = new waterV();
				productvo.setName(rs.getString("NAME"));		
				productvo.setMg(rs.getFloat("Mg"));
				productvo.setCa(rs.getFloat("Ca"));
				productvo.setK(rs.getFloat("K"));
				productvo.setNa(rs.getFloat("Na"));
				productvo.setSiO2(rs.getFloat("SiO2"));
				productvo.setMo(rs.getFloat("Mo"));
				productvo.setV(rs.getFloat("V"));
				productvo.setGe(rs.getFloat("Ge"));
				productvo.setOI(rs.getFloat("OI"));
			
				waterList.add(productvo);
			}
		}
		else {
			while (rs.next()) {
				if(search.equals(rs.getString("NAME"))){
					waterV productvo = new waterV();
					productvo.setName(rs.getString("NAME"));		
					productvo.setMg(rs.getFloat("Mg"));
					productvo.setCa(rs.getFloat("Ca"));
					productvo.setK(rs.getFloat("K"));
					productvo.setNa(rs.getFloat("Na"));
					productvo.setSiO2(rs.getFloat("SiO2"));
					productvo.setMo(rs.getFloat("Mo"));
					productvo.setV(rs.getFloat("V"));
					productvo.setGe(rs.getFloat("Ge"));
					productvo.setOI(rs.getFloat("OI"));
				
					waterList.add(productvo);
				}
			}
			
		}
		waterObList.addAll(waterList);

		rs.close();
		ps.close();
		con.close();
		
		return waterObList;
	}

}

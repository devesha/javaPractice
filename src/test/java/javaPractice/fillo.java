package javaPractice;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class fillo {

	public static void main(String[] args) throws FilloException {
		// TODO Auto-generated method stub

		Fillo fillo= new Fillo();
		
		Connection connection = fillo.getConnection("src/test/resources/test.xlsx");
		String strQuery="select * from sheet1";
		Recordset rs=connection.executeQuery(strQuery);
	
		while(rs.next())
		{
			
			System.out.println(rs.getField("propertyType"));
		}
	
	}

}

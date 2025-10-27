package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//jdbc operations to customerTb
public class CustomerDao {
	// login
	public boolean login(String account, String password) {

		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			connection = BaseDao.getConnection();

			String sql = "select * from customerTb where cus_account = ? and cus_password = ?";
			ps = connection.prepareStatement(sql);
			ps.setString(1, account);
			ps.setString(2, password);
			rs = ps.executeQuery();

			return rs.next(); // true, 1 row of data, false, no data->invalid account or password
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.close(rs, ps, connection);
		}

		return false;	//exception happened
	}

	// register

	// modify personal information

}

import java.sql.Connection;

public class UserDAO {
	private DBUtil db=null;
	boolean findUser(String userName,String userPassword) {
		db=new DBUtil();
		Connection connection=db.getConnection();
		return false;
	}
	
}

package dao;
/**
 * 	������ݿ����Ӻ͹ر���Դ�Ĺ�����
 * @author 12584
 *s
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	private static Connection conn;
	/**
	 * 	������ݿ����ӵķ���
	 * @return	���ݿ����Ӷ���
	 */
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");//	��������
			conn=DriverManager.getConnection("jdbc:mysql://localhost/students?useUnicode=true&characterEncoding=UTF-8",
					"root","root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 *  	�ͷ���Դ�ķ���
	 * @param rs	���������
	 * @param pst	SQLִ�ж���
	 * @param conn ���ݿ����Ӷ���
	 */
	public static void closeAll(Connection conn,PreparedStatement pst,ResultSet rs) {
		try {
			if(rs != null){
				rs.close();
			}
			if(pst != null){
				pst.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package DAO模式;

import java.sql.*;

public class BaseDao {
    private final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final static String DB_URL = "jdbc:mysql://localhost:3306/newssystem";
    private final static String USER = "root";
    private final static String PASS = "123456";
    private Connection connection = null;

    protected Connection getConnection(){

        try {

                // 注册 JDBC 驱动
                Class.forName(JDBC_DRIVER);
                // 打开链接
                connection = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (Exception e) {

        }finally {
            return connection;
        }
    }

    /**
     * 执行添加、删除、修改使用的方法
     *
     * */
    protected int exeUpdate(String sql,Object[] objects){
        int rs = 0;
        PreparedStatement stmt = null;
        getConnection();
        try {
            stmt = connection.prepareStatement(sql);
            for (int i=0;i<objects.length;i++){
                stmt.setObject(i+1,objects[i]);
            }
            rs = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(connection,stmt,null);
        }
        return rs;
    }

    /**
     * 执行查询使用的方法
     *
     * */
    protected ResultSet exeSelect(String sql,Object[] objects){
        ResultSet rs = null;
        PreparedStatement stmt = null;
        getConnection();
        try {
            stmt = connection.prepareStatement(sql);
            for (int i=0;i<objects.length;i++){
                stmt.setObject(i+1,objects[i]);
            }
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(null,null,null);
        }
        return rs;
    }

    protected void close(Connection con, PreparedStatement statem, ResultSet rs){
        try {
            if (rs !=null){
                rs.close();
            }
            if (statem !=null){
                statem.close();
            }
            if (con !=null){
                con.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

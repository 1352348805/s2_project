package DAO模式;

import java.sql.*;

public class NewDaoMysqlImpl extends BaseDao implements NewDao {


    @Override
    public int add(User user) {
        int rs = 0;
        String sql = "INSERT INTO `news_users`(`uname`,`upwd`) VALUES(?,?)";
        Object[] objects = {user.getUname(),user.getUpwd()};
        rs = super.exeUpdate(sql,objects);
        return rs;

    }
    @Override
    public int del(User user) {
        int rs = 0;
        String sql = "DELETE FROM `news_users` WHERE `uid`=?";
        Object[] objects = {user.getUid()};
        rs = super.exeUpdate(sql,objects);
        return rs;
    }

    @Override
    public int update(User user) {
        int rs = 0;
        String sql = "UPDATE `news_users` SET `uname`=?, `upwd`=? WHERE `uid`=?";
        Object[] objects = {user.getUname(),user.getUpwd(),user.getUid()};
        rs = super.exeUpdate(sql,objects);
        return rs;
    }

    @Override
    public User findByName(String name) {
        User user = null;
        String sql = "SELECT * FROM `news_users` WHERE `uname`=?";
        Object[] objects = {name};
        ResultSet rs = super.exeSelect(sql,objects);
        try {
            if (rs.next()){
                user = new User();
                user.setUid( rs.getInt("uid"));
                user.setUname(rs.getString("uname"));
                user.setUpwd(rs.getInt("upwd"));
            }
        }catch (Exception e){

        }finally {
            close(getConnection(),null,rs);
        }
        return user;
    }
}

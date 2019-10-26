package DAO模式;

import org.junit.Test;

public class Daotest {

    @Test
    public  void add(){
        NewDao dao = new NewDaoMysqlImpl();
        User user = new User();
        user.setUname("asd");
        user.setUpwd(123213);
        int i = dao.add(user);
        System.out.println( i>0?"成功":"失败");
    }
    @Test
    public  void delete(){
        NewDao dao = new NewDaoMysqlImpl();
        User user = new User();
        user.setUid(5);
        int i = dao.del(user);
        System.out.println( i>0?"成功":"失败");
    }
    @Test
    public  void update(){
        NewDao dao = new NewDaoMysqlImpl();
        User user = new User();
        user.setUid(6);
        user.setUname("yoooo");
        user.setUpwd(123123);
        int i = dao.update(user);
        System.out.println( i>0?"成功":"失败");
    }

    @Test
    public  void select(){
        NewDao dao = new NewDaoMysqlImpl();
        User user = new User();
        user = dao.findByName("sa");
        System.out.println(user);
    }
}

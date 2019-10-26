package DAO模式;

public interface NewDao {
    int add(User user);
    int del(User user);
    int update(User user);
    User findByName(String name);
}

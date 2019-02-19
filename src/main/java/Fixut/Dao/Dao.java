package Fixut.Dao;

import Fixut.Entity.User;

public interface Dao {

    User findByUserName(String username);

}

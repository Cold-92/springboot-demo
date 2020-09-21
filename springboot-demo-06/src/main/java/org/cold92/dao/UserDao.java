package org.cold92.dao;

import org.apache.ibatis.annotations.Insert;
import org.cold92.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    int insertUser(User user);

}

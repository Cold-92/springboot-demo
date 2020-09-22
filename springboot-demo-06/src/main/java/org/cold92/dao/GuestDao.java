package org.cold92.dao;

import org.apache.ibatis.annotations.Mapper;
import org.cold92.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface GuestDao {

    List<Guest> list();

}

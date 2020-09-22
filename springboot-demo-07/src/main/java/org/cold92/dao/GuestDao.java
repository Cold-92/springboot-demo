package org.cold92.dao;

import org.apache.ibatis.annotations.Mapper;
import org.cold92.bean.Guest;

import java.util.List;

@Mapper
public interface GuestDao {

    List<Guest> list();

}

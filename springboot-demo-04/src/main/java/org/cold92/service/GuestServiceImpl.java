package org.cold92.service;

import org.cold92.bean.Guest;
import org.cold92.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao guestDao;

    @Override
    public List<Guest> list() {
        return guestDao.list();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public void update(Guest guest) throws Exception {
        guestDao.update(guest);
    }

    @Override
    public Guest findGuestByName(String name) {
        return guestDao.findGuestByName(name);
    }

    @Override
    public void delete(String name) throws Exception {
        guestDao.delete(name);
    }

}

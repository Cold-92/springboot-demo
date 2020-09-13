package org.cold92.dao;

import org.cold92.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    private static List<Guest> guestList = new ArrayList<>();

    static {
        guestList.add(new Guest("john", 12, "male"));
        guestList.add(new Guest("eric", 15, "male"));
        guestList.add(new Guest("peter", 16, "female"));
        guestList.add(new Guest("smith", 17, "female"));
    }

    public List<Guest> list() {
        return guestList;
    }

    public void add(Guest guest) {
        guestList.add(guest);
    }

    public void update(Guest guest) throws Exception {
        Guest result = findGuestByName(guest.getName());
        if (result != null) {
            result.setAge(guest.getAge());
            result.setSex(guest.getSex());
        } else {
            throw new Exception("update error");
        }
    }

    public Guest findGuestByName(String name) {
        for (Guest guest : guestList) {
            if (guest.getName().equals(name)) {
                return guest;
            }
        }
        return null;
    }

    public void delete(String name) throws Exception {
        Guest guest = findGuestByName(name);
        if (guest != null) {
            guestList.remove(guest);
        }
    }

}

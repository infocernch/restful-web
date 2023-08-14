package com.example.restfulwebservice.user;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDaoService {

    private static int usersCount = 3;
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Song", new Date(),"pass1","701017-1111111"));
        users.add(new User(2, "Woo", new Date(),"pass2","801017-1111111"));
        users.add(new User(3, "ChimChakMan", new Date(),"pass3","901017-1111111"));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id) {
        //열거형데이터 배열 등을 순차적으로 접근하여 사용하기 위한
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();

            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }


    public User updateUser(User user,int id) {

        for (User user1 : users) {
            if (user1.getId() == id) {
                user1.setId(user.getId());
                user1.setName(user.getName());
                user1.setJoinDate(user.getJoinDate());
                return user1;
            }
        }
        return null;
    }
}

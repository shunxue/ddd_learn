package com.xuesran.business.modeling.chapter01.impl.db;

import com.xuesran.business.modeling.chapter01.models.User;
import com.xuesran.business.modeling.chapter01.models.UserRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * The type User repository db.
 *
 * @author xueshun
 */
public class UserRepositoryDB implements UserRepository {


    @Override
    public User findBy(long id) {
        User user = new User();
        return this.setMySubscription(user);
    }



    @Override
    public List<User> findBy(List<Long> ld) {
        List<User> userList = new ArrayList<>();
        userList.stream().map(this::setMySubscription);
        return userList;
    }

    private User setMySubscription(User user) {
        user.setMySubscriptions(new MySubscriptionsDB(user));
        return user;
    }


}

package com.xuesran.business.modeling.chapter02_decorator.repo.imp;

import com.xuesran.business.modeling.chapter02_decorator.roles.Contact;
import com.xuesran.business.modeling.chapter02_decorator.models.User;
import com.xuesran.business.modeling.chapter02_decorator.repo.UserRepository;
import com.xuesran.business.modeling.chapter02_decorator.roles.Buyer;
import com.xuesran.business.modeling.chapter02_decorator.roles.Reader;
import org.springframework.stereotype.Repository;

/**
 * The type User repository db.
 *
 * @author xueshun
 */
@Repository
public class UserRepositoryDB implements UserRepository {

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public Buyer asBuyer(User user) {
        return new Buyer(user);
    }

    @Override
    public Reader asReader(User user) {
        return new Reader(user);
    }

    @Override
    public Contact asContact(User user) {
        return new Contact(user);
    }
}

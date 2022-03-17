package com.xuesran.business.modeling.chapter02_decorator.repo;

import com.xuesran.business.modeling.chapter02_decorator.models.User;
import com.xuesran.business.modeling.chapter02_decorator.roles.Buyer;
import com.xuesran.business.modeling.chapter02_decorator.roles.Contact;
import com.xuesran.business.modeling.chapter02_decorator.roles.Reader;

/**
 * The interface User repository.
 *
 * @author xueshun
 */
public interface UserRepository {

    /**
     * Find by id user.
     *
     * @param id the id
     * @return the user
     */
    User findById(long id);

    /**
     * As buyer buyer.
     *
     * @param user the user
     * @return the buyer
     */
    Buyer asBuyer(User user);

    /**
     * As reader reader.
     *
     * @param user the user
     * @return the reader
     */
    Reader asReader(User user);

    /**
     * As contact contact.
     *
     * @param user the user
     * @return the contact
     */
    Contact asContact(User user);
}

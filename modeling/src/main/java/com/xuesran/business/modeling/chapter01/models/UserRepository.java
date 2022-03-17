package com.xuesran.business.modeling.chapter01.models;

import java.util.List;

/**
 * The interface User repository.
 *
 * @author xueshun
 */
public interface UserRepository {

    /**
     * Find by user.
     *
     * @param id the id
     * @return the user
     */
    User findBy(long id);

    /**
     * Find by list.
     *
     * @param ld the ld
     * @return the list
     */
    List<User> findBy(List<Long> ld);
}

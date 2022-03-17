package com.xuesran.business.modeling.chapter02_context.repo;

import com.xuesran.business.modeling.chapter02_decorator.models.Friedship;

/**
 * The interface Friend ship repository.
 *
 * @author xueshun
 */
public interface FriendShipRepository {
    /**
     * Query by friedship.
     *
     * @param userId  the user id
     * @param userId1 the user id 1
     * @return the friedship
     */
    Friedship queryBy(Long userId, Long userId1);

    /**
     * Insert.
     *
     * @param friedship the friedship
     */
    void insert(Friedship friedship);
}

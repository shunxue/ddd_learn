package com.xuesran.business.modeling.chapter02_context.repo.imp;

import com.xuesran.business.modeling.chapter02_context.repo.FriendShipRepository;
import com.xuesran.business.modeling.chapter02_decorator.models.Friedship;
import org.springframework.stereotype.Repository;

/**
 * The type Friend ship repository db.
 *
 * @author xueshun
 */
@Repository
public class FriendShipRepositoryDB implements FriendShipRepository {
    @Override
    public Friedship queryBy(Long userId, Long userId1) {
        return null;
    }

    @Override
    public void insert(Friedship friedship) {

    }
}

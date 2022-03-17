package com.xuesran.business.modeling.chapter02_context.repo;

import com.xuesran.business.modeling.chapter02_context.context.OrderContext;
import com.xuesran.business.modeling.chapter02_context.context.SocialContext;
import com.xuesran.business.modeling.chapter02_context.context.SubscriptionContext;
import com.xuesran.business.modeling.chapter02_context.models.User;

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
     * In subscription context subscription context.
     *
     * @return the subscription context
     */
    SubscriptionContext inSubscriptionContext();

    /**
     * In social context social context.
     *
     * @return the social context
     */
    SocialContext inSocialContext();

    /**
     * In order context order context.
     *
     * @return the order context
     */
    OrderContext inOrderContext();
}

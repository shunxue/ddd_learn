package com.xuesran.business.modeling.chapter02_context.repo.imp;

import com.xuesran.business.modeling.chapter02_context.domain.OrderContext;
import com.xuesran.business.modeling.chapter02_context.domain.SocialContext;
import com.xuesran.business.modeling.chapter02_context.domain.SubscriptionContext;
import com.xuesran.business.modeling.chapter02_context.models.User;
import com.xuesran.business.modeling.chapter02_context.repo.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * The type User repository db.
 *
 * @author xueshun
 */
@Repository
public class UserRepositoryDB implements UserRepository {

    private final SubscriptionContext subscriptionContext;
    private final SocialContext socialContext;
    private final OrderContext orderContext;

    public UserRepositoryDB(SubscriptionContext subscriptionContext,
                            SocialContext socialContext,
                            OrderContext orderContext) {
        this.subscriptionContext = subscriptionContext;
        this.socialContext = socialContext;
        this.orderContext = orderContext;
    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public SubscriptionContext inSubscriptionContext() {
        return subscriptionContext;
    }

    @Override
    public SocialContext inSocialContext() {
        return socialContext;
    }

    @Override
    public OrderContext inOrderContext() {
        return orderContext;
    }

}

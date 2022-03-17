package com.xuesran.business.modeling.chapter02_context.context.impl;

import com.xuesran.business.modeling.chapter02_context.context.SocialContext;
import com.xuesran.business.modeling.chapter02_context.context.SubscriptionContext;
import com.xuesran.business.modeling.chapter02_context.models.User;
import org.springframework.stereotype.Component;

/**
 * The type Subscription context.
 *
 * @author xueshun
 */
@Component
public class SubscriptionContextDB implements SubscriptionContext {
    private final SocialContext socialContext;

    public SubscriptionContextDB(SocialContext socialContext) {
        this.socialContext = socialContext;
    }

    @Override
    public Reader asReader(User user) {
        return null;
    }
}

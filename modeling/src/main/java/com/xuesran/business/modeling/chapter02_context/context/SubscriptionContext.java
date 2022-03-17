package com.xuesran.business.modeling.chapter02_context.context;

import com.xuesran.business.modeling.chapter02_context.models.Content;
import com.xuesran.business.modeling.chapter02_context.models.Subscription;
import com.xuesran.business.modeling.chapter02_context.models.User;
import com.xuesran.business.modeling.chapter02_decorator.models.Friedship;

import java.util.List;

/**
 * The interface Subscription context.
 *
 * @author xueshun
 */
public interface SubscriptionContext {

    interface Reader{
        boolean canView(Content content);

        boolean transfer(Subscription subscription, User friedship);

        List<Subscription> getSubscriptions(int from, int to);
    }

    Reader asReader(User user);
}

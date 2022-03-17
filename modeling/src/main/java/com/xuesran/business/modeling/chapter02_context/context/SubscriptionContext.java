package com.xuesran.business.modeling.chapter02_context.context;

import com.xuesran.business.modeling.chapter02_context.models.Content;
import com.xuesran.business.modeling.chapter02_context.models.User;

/**
 * The interface Subscription context.
 *
 * @author xueshun
 */
public interface SubscriptionContext {

    interface Reader{
        boolean canView(Content content);
    }

    Reader asReader(User user);
}

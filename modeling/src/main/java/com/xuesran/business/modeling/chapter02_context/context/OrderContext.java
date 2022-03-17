package com.xuesran.business.modeling.chapter02_context.context;

import com.xuesran.business.modeling.chapter02_context.models.Column;
import com.xuesran.business.modeling.chapter02_context.models.User;

/**
 * The type Order context.
 *
 * @author xueshun
 */
public interface OrderContext {

    interface Buyer{
        void placeOrder(Column column);
    }

    Buyer asBuyer(User user);
}


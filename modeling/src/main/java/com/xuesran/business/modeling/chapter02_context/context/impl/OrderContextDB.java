package com.xuesran.business.modeling.chapter02_context.context.impl;

import com.xuesran.business.modeling.chapter02_context.context.OrderContext;
import com.xuesran.business.modeling.chapter02_context.models.User;
import org.springframework.stereotype.Component;

@Component
public class OrderContextDB implements OrderContext {
    @Override
    public Buyer asBuyer(User user) {
        return null;
    }
}

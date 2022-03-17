package com.xuesran.business.modeling.chapter02_context.domain.impl;

import com.xuesran.business.modeling.chapter02_context.domain.OrderContext;
import com.xuesran.business.modeling.chapter02_context.models.Column;
import com.xuesran.business.modeling.chapter02_context.models.User;
import org.springframework.stereotype.Component;

@Component
public class OrderContextDB implements OrderContext {
    @Override
    public Buyer asBuyer(User user) {
        return new Buyer() {
            @Override
            public void placeOrder(Column column) {

            }
        };
    }
}

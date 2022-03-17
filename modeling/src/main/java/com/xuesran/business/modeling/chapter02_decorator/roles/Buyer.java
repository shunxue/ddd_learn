package com.xuesran.business.modeling.chapter02_decorator.roles;

import com.xuesran.business.modeling.chapter02_decorator.models.Column;
import com.xuesran.business.modeling.chapter02_decorator.models.Order;
import com.xuesran.business.modeling.chapter02_decorator.models.Payment;
import com.xuesran.business.modeling.chapter02_decorator.models.User;

import java.util.List;

/**
 * 订单上下文
 *
 * @author xueshun
 */
public class Buyer {

    private User user;

    private List<Order> orders;

    private List<Payment> payments;

    public Buyer(User user) {
        this.user = user;
    }

    public void placeOrder(Column column){

    }
}

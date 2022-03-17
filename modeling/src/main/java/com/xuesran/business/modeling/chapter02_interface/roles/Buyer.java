package com.xuesran.business.modeling.chapter02_interface.roles;

import com.xuesran.business.modeling.chapter02_interface.models.Column;
import com.xuesran.business.modeling.chapter02_interface.models.Order;
import com.xuesran.business.modeling.chapter02_interface.models.Payment;

import java.util.List;

/**
 * 订单上下文
 *
 * @author xueshun
 */
public interface Buyer {

    /**
     * Gets orders.
     *
     * @return the orders
     */
    List<Order> getOrders();

    /**
     * Gets payments.
     *
     * @return the payments
     */
    List<Payment> getPayments();

    /**
     * Place order.
     *
     * @param column the column
     */
    void placeOrder(Column column);
}

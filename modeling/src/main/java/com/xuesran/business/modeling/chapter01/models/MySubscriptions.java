package com.xuesran.business.modeling.chapter01.models;

import java.util.List;

/**
 * The interface My subscription.
 *
 * @author xueshun
 */
public interface MySubscriptions {

    /**
     * 分页查询订阅列表
     *
     * @param from the from
     * @param to   the to
     * @return the list
     */
    List<Subscription> subList(int from, int to);


    Long getTotalSubscriptionFee();
}

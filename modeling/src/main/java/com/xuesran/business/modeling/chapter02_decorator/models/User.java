package com.xuesran.business.modeling.chapter02_decorator.models;

import com.xuesran.business.modeling.chapter01.models.MySubscriptions;

/**
 * The type User.
 *
 * @author xueshun
 */
public class User {
    private MySubscriptions mySubscriptions;

    public MySubscriptions getMySubscriptions() {
        return mySubscriptions;
    }

    public void setMySubscriptions(MySubscriptions mySubscriptions) {
        this.mySubscriptions = mySubscriptions;
    }
}

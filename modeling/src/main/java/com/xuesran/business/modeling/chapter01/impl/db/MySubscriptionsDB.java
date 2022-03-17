package com.xuesran.business.modeling.chapter01.impl.db;

import com.xuesran.business.modeling.chapter01.models.MySubscriptions;
import com.xuesran.business.modeling.chapter01.models.Subscription;
import com.xuesran.business.modeling.chapter01.models.User;

import java.util.List;

/**
 * The type My subscription db.
 *
 * @author xueshun
 */
public class MySubscriptionsDB implements MySubscriptions {

    private final User user;

    public MySubscriptionsDB(User user) {
        this.user = user;
    }

    @Override
    public List<Subscription> subList(int from, int to) {
        return null;
    }

    @Override
    public Long getTotalSubscriptionFee() {
        return null;
    }
}

package com.xuesran.business.modeling.chapter02_decorator.roles;

import com.xuesran.business.modeling.chapter02_decorator.models.Content;
import com.xuesran.business.modeling.chapter02_decorator.models.Subscription;
import com.xuesran.business.modeling.chapter02_decorator.models.User;

import java.util.List;

/**
 * 阅读上下文
 *
 * @author xueshun
 */
public class Reader {

    private User user;
    private List<Subscription> subscriptions;

    public Reader(User user) {
    }

    public boolean canView(Content content) {
        return false;
    }
}

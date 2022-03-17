package com.xuesran.business.modeling.chapter02_decorator.roles;

import com.xuesran.business.modeling.chapter02_decorator.models.Friedship;
import com.xuesran.business.modeling.chapter02_decorator.models.Moments;
import com.xuesran.business.modeling.chapter02_decorator.models.User;

import java.util.List;

/**
 * 社交上下文
 *
 * @author xueshun
 */
public class Contact {
    private User user;
    private List<Friedship> friends;
    private List<Moments> moments;

    public Contact(User user) {
    }

    // 社交上下文
    public void make(Friedship friend) {
    }

    public void breaked(Friedship friend) {

    }
}

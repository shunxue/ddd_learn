package com.xuesran.business.modeling.chapter02_context.context.impl;

import com.xuesran.business.modeling.chapter02_context.context.SocialContext;
import com.xuesran.business.modeling.chapter02_context.models.User;
import org.springframework.stereotype.Component;

/**
 * The type Social context.
 *
 * @author xueshun
 */
@Component
public class SocialContextDB implements SocialContext {
    @Override
    public Contact asContact(User user) {
        return null;
    }
}

package com.xuesran.business.modeling.chapter02_context.context.impl;

import com.xuesran.business.modeling.chapter02_context.context.SocialContext;
import com.xuesran.business.modeling.chapter02_context.models.User;
import com.xuesran.business.modeling.chapter02_decorator.models.Friedship;
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
        return new SocialContextTT(user);
    }

    public class SocialContextTT implements  SocialContext.Contact{
        private final User user;

        public SocialContextTT(User user) {
            this.user = user;
        }

        @Override
        public void make(Friedship friedship) {

        }

        @Override
        public boolean isFriend(User user) {
            return false;
        }
    }
}

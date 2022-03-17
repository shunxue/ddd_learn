package com.xuesran.business.modeling.chapter02_context.context;

import com.xuesran.business.modeling.chapter02_context.models.User;
import com.xuesran.business.modeling.chapter02_decorator.models.Friedship;

/**
 * The type Social context.
 *
 * @author xueshun
 */
public interface SocialContext {
    /**
     * The interface Contact.
     *
     * @author xueshun
     */
    interface Contact{
        /**
         * Make.
         *
         * @param friedship the friedship
         */
        void make(Friedship friedship);

        /**
         * Is friend boolean.
         *
         * @param user the user
         * @return the boolean
         */
        boolean isFriend(User user);
    }

    /**
     * As contact contact.
     *
     * @param user the user
     * @return the contact
     */
    Contact asContact(User user);
}

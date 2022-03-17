package com.xuesran.business.modeling.chapter02_interface.roles;

import com.xuesran.business.modeling.chapter02_interface.models.Contact;
import com.xuesran.business.modeling.chapter02_interface.models.Subscription;

import java.util.List;

/**
 * 阅读上下文
 *
 * @author xueshun
 */
public interface Reader {

    /**
     * Gets subscriptions.
     *
     * @return the subscriptions
     */
    List<Subscription> getSubscriptions();

    /**
     * Can view boolean.
     *
     * @param contact the contact
     * @return the boolean
     */
    boolean canView(Contact contact);
}

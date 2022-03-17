package com.xuesran.business.modeling.chapter02_interface.roles;

import com.xuesran.business.modeling.chapter02_interface.models.Friedship;
import com.xuesran.business.modeling.chapter02_interface.models.Moments;

import java.util.List;

/**
 * 社交上下文
 *
 * @author xueshun
 */
public interface Contact {
    /**
     * The constant friends.
     *
     * @return the list
     */
    List<Friedship> friends();

    /**
     * The constant moments.
     *
     * @return the list
     */
    List<Moments> moments();

    /**
     * Make.
     *
     * @param friend the friend
     */
    void make(Friedship friend);


    /**
     * Breaked.
     *
     * @param friend the friend
     */
    void breaked(Friedship friend);
}

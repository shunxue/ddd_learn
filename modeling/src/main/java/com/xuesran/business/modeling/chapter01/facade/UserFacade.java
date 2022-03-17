package com.xuesran.business.modeling.chapter01.facade;

import com.xuesran.business.modeling.chapter01.models.Subscription;
import com.xuesran.business.modeling.chapter01.models.User;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * The type User facade.
 *
 * @author xueshun
 */
@Service
public class UserFacade {

    public List<Subscription> getUserSubscription(){
        User user = new User();
        return  user.getMySubscriptions().subList(0, 10);
    }
}

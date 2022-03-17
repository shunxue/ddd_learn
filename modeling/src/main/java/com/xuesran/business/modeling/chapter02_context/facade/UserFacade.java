package com.xuesran.business.modeling.chapter02_context.facade;

import com.xuesran.business.modeling.chapter02_context.domain.OrderContext;
import com.xuesran.business.modeling.chapter02_context.domain.SubscriptionContext;
import com.xuesran.business.modeling.chapter02_context.models.Content;
import com.xuesran.business.modeling.chapter02_context.models.Subscription;
import com.xuesran.business.modeling.chapter02_context.models.User;
import com.xuesran.business.modeling.chapter02_context.repo.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserFacade {
    private final UserRepository userRepository;

    public UserFacade(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean canView(Content contact){
        User byId = userRepository.findById(0L);
        OrderContext.Buyer buyer = userRepository.inOrderContext().asBuyer(byId);
        return false;
    }

    public boolean transfer(){
        User byId = userRepository.findById(0L);
        User friend = userRepository.findById(1L);

        SubscriptionContext.Reader reader = userRepository.inSubscriptionContext().asReader(byId);
        Subscription subscription = reader.getSubscriptions(1, 1).get(0);
        return reader.transfer(subscription, friend);
    }
}

package com.xuesran.business.modeling.chapter02_decorator.facade;

import com.xuesran.business.modeling.chapter02_decorator.models.Content;
import com.xuesran.business.modeling.chapter02_decorator.models.Subscription;
import com.xuesran.business.modeling.chapter02_decorator.models.User;
import com.xuesran.business.modeling.chapter02_decorator.repo.UserRepository;
import com.xuesran.business.modeling.chapter02_interface.models.Contact;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFacade {
    private final UserRepository userRepository;

    public UserFacade(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean canView(Content contact){
        User byId = userRepository.findById(0L);
        return userRepository.asReader(byId).canView(contact);
    }
}

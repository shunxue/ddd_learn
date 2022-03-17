package com.xuesran.business.modeling.chapter02_context.context.impl;

import com.xuesran.business.modeling.chapter02_context.context.SocialContext;
import com.xuesran.business.modeling.chapter02_context.models.User;
import com.xuesran.business.modeling.chapter02_context.repo.FriendShipRepository;
import com.xuesran.business.modeling.chapter02_decorator.models.Friedship;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * The type Social context.
 *
 * @author xueshun
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class SocialContextDB implements SocialContext {

    private final FriendShipRepository friendShipRepository;

    @Override
    public Contact asContact(User user) {
        return new Contact() {
            @Override
            public void make(Friedship friedship) {
                friendShipRepository.insert(friedship);
            }

            @Override
            public boolean isFriend(User friend) {
                return friendShipRepository.queryBy(user.getUserId(), friend.getUserId()) != null;
            }
        };
    }

}

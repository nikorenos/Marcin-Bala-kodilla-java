package com.kodilla.patterns.strategy.social.canals;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "share on Facebook";
    }
}

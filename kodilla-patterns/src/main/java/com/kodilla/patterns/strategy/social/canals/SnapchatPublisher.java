package com.kodilla.patterns.strategy.social.canals;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "share on Snapchat";
    }
}

package com.kodilla.patterns.social.media;

import com.kodilla.patterns.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Twitter";
    }
}

package com.kodilla.patterns.social.media;

import com.kodilla.patterns.social.SocialPublisher;

public class SnapshatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Snapchat";
    }
}

package com.kodilla.patterns.social;

import com.kodilla.patterns.social.media.TwitterPublisher;

public class ZGeneration extends User {
    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}

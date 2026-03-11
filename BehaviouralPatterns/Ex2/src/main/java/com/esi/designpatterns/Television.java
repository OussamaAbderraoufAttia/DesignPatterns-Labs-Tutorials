package com.esi.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Television {
    private List<Channel> channels = new ArrayList<>();

    public void addChannel(Channel c) {
        this.channels.add(c);
    }

    public ChannelIterator getIterator() {
        return new BasicChannelIterator(channels);
    }
}

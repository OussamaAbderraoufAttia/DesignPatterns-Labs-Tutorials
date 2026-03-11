package com.esi.designpatterns;

import java.util.List;

public class BasicChannelIterator implements ChannelIterator {
    private List<Channel> channels;
    private int position = -1;

    public BasicChannelIterator(List<Channel> channels) {
        this.channels = channels;
    }

    @Override
    public boolean hasNext() {
        return position < channels.size() - 1;
    }

    @Override
    public Channel next() {
        if (hasNext()) {
            return channels.get(++position);
        }
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return position > 0;
    }

    @Override
    public Channel previous() {
        if (hasPrevious()) {
            return channels.get(--position);
        }
        return null;
    }
}

package com.esi.designpatterns;

public interface ChannelIterator {
    boolean hasNext();
    Channel next();
    boolean hasPrevious();
    Channel previous();
}

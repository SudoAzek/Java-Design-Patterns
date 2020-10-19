package com.mezonworks.observer_pattern.with_simple_observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

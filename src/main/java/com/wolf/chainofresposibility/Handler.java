package com.wolf.chainofresposibility;

public abstract class Handler {
    private Handler next;

    public abstract void handle(Video video);
    public void invokeNext(Video video) {
        if (next != null)  {
            next.handle(video);
        }
    }
    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }
}

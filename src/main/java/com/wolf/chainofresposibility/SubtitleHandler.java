package com.wolf.chainofresposibility;

public class SubtitleHandler extends Handler{
    @Override
    public void handle(Video video) {
        if (video.getSubtitle() == null) {
            System.out.println("Doing subtitle");
        }
        this.invokeNext(video);
    }
}

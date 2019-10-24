package com.wolf.chainofresposibility;

public class VoiceHandler extends Handler {
    @Override
    public void handle(Video video) {
        Integer idx = 1_0000;
        if (video.getVoice() != null) {
            System.out.println("doing voice");
        }
       this.invokeNext(video);
    }
}

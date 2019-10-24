package com.wolf.chainofresposibility;

public class ExportHandler extends Handler {
    @Override
    public void handle(Video video) {
        if (video.getExported() == false) {
            System.out.println("exporting");
        }
        this.invokeNext(video);
    }
}

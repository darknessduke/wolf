package com.wolf.chainofresposibility;

public class VideoEditing {
    public static void main(String[] args) {
        Video video = new Video("subtitle","voice",false);
        Handler subtitleHandler = new SubtitleHandler();
        Handler voiceHandler = new VoiceHandler();
        Handler exportHandler = new ExportHandler();

        subtitleHandler.setNext(voiceHandler);
        voiceHandler.setNext(exportHandler);
        subtitleHandler.handle(video);
    }

}
